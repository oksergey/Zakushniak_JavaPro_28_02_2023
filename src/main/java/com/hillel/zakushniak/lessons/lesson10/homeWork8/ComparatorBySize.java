package main.java.com.hillel.zakushniak.lessons.lesson10.homeWork8;

import java.util.Comparator;

public class ComparatorBySize implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((FileData)o1).getFileSize() - ((FileData)o2).getFileSize();
    }
}
