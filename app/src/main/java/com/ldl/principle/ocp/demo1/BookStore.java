package com.ldl.principle.ocp.demo1;


import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    private final static ArrayList<IBook> offBookList = new ArrayList<IBook>();

    static {
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
        bookList.add(new NovelBook("悲惨世界", 3500, "雨果"));
        bookList.add(new NovelBook("金瓶梅", 4300, "兰陵笑笑生"));
    }

    static {
        offBookList.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        offBookList.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
        offBookList.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
        offBookList.add(new OffNovelBook("金瓶梅", 4300, "兰陵笑笑生"));
    }

    public static void main(String[] args) {
        System.out.println("---书店卖出去的书籍记录如下：---");
        for (IBook book : bookList) {
            System.out.println(book.toString());
        }
        System.out.println("------------------------------");
        System.out.println("---打折销售书籍如下：---");
        for (IBook book : offBookList) {
            System.out.println(book.toString());
        }
    }
}
