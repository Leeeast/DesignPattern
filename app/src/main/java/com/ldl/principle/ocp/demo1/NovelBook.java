package com.ldl.principle.ocp.demo1;


import java.text.NumberFormat;

public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    public NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        return "书籍名称：" + getName()
                + "\t书籍作者：" + getAuthor()
                + "\t书籍价格：" + format.format(getPrice() / 100.0) + "元";
    }
}
