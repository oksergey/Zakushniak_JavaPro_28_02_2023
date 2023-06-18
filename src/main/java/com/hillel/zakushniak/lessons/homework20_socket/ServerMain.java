package com.hillel.zakushniak.lessons.homework20_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;

/**
 * Нужно создать приложение, которое будет основываться на ServerSocket. При старте приложение слушает порт 8081 и ожидает подключение 1 клиента.
 * <p>
 * После того как клиент подключается к серверу, они обмениваются приветствиями. Пример (hello => привіт ).
 * <p>
 * Если в приветствии клиента есть русские буквы, которых нет в украинском языке, сервис должен спросить "що таке паляниця?". Если клиент ответит правильно, то сервер должен вернуть текущие дату и время и попрощаться. В противном случаи клиент должен быть отключен.....
 */
public class ServerMain {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("Server is listening on port 8081");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected to the client");

            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            String message;
            do {
                message = "Hi there!";
                writer.write(message);
                writer.newLine();
                writer.flush();

                message = bufferedReader.readLine().toLowerCase();
                boolean isContainRussiansLetters = message.contains("ё") ||
                                                   message.contains("й") ||
                                                   message.contains("ъ") ||
                                                   message.contains("ы");

                writer.write(isContainRussiansLetters ? "Що таке паляниця?" : "Як ся маєш?");
                writer.newLine();
                writer.flush();

                message = bufferedReader.readLine().toLowerCase();

                if (message.equals("хліб")) {
                    writer.write(LocalDate.now() + " Бувай!");
                    writer.newLine();
                    writer.flush();
                }

                if (isContainRussiansLetters & !message.equals("хліб")) {
                    writer.write("Вчи українську, кацап!");
                    writer.newLine();
                    writer.flush();
                    message = null;
                }

            } while (message != null);

        } catch (
                IOException e) {
            System.out.println("Error when trying to listen/accept connection or read input");
            e.printStackTrace();
        }


    }
}
