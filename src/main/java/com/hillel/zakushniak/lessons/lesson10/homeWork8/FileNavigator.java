package main.java.com.hillel.zakushniak.lessons.lesson10.homeWork8;

import java.util.*;

public class FileNavigator {
    private Map<String, ArrayList<FileData>> fileNavi;

    public FileNavigator() {
        this.fileNavi = new HashMap<>();
    }

    void add(FileData file) {
        if (fileNavi.isEmpty()) {
            ArrayList<FileData> temp = new ArrayList<>();
            temp.add(file);
            fileNavi.put(file.getFilePath(), temp);
        } else if (fileNavi.containsKey(file.getFilePath()) && !fileNavi.containsValue(file)) {
            ArrayList<FileData> temp = fileNavi.get(file.getFilePath());
            temp.add(file);
            fileNavi.put(file.getFilePath(), temp);
        } else {
            System.out.println("Error! Wrong Path.");
        }
    }

    void addDifferentPathes(FileData file) {
        if (!fileNavi.containsKey(file.getFilePath())) {
            ArrayList<FileData> addingPass = new ArrayList<>();
            fileNavi.put(file.getFilePath(), addingPass);
        }
        ArrayList<FileData> temp = fileNavi.get(file.getFilePath());
        temp.add(file);
        fileNavi.put(file.getFilePath(), temp);
    }

    ArrayList find(String path) {
        return fileNavi.get(path);
    }

    ArrayList filterBySize(int size) {
        ArrayList<FileData> filteredBySize = new ArrayList<>();
        for (ArrayList<FileData> entry : fileNavi.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (entry.get(i).getFileSize() <= size) {
                    filteredBySize.add(entry.get(i));
                }
            }
        }
        return filteredBySize;
    }

    void remove(String path) {
        fileNavi.remove(path);
    }

    ArrayList sortBySize() {
        ArrayList<FileData> sortedBySize = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : fileNavi.entrySet()) {
            sortedBySize = entry.getValue();
        }
        Collections.sort(sortedBySize, new ComparatorBySize());
        return sortedBySize;
    }

    void draw() {
        System.out.print("Draw storage: ");
        if (!fileNavi.isEmpty()) {
            for (Map.Entry<String, ArrayList<FileData>> entry : fileNavi.entrySet()) {
                String key = entry.getKey();
                ArrayList<FileData> value = entry.getValue();
                System.out.println(key + ": " + "\n" + value);
                System.out.println();
            }
        } else System.out.print("is empty.");
    }
}



