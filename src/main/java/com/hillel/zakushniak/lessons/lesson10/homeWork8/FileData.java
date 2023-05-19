package com.hillel.zakushniak.lessons.lesson10.homeWork8;

public class FileData {

    private String fileName;
    private int fileSize;
    private String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "\n" + "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize;
    }
}
