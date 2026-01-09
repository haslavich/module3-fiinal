package com.javarush.quest.model;

import java.util.Random;

public class QuickCard {
    private String maste;
    private String Level;
    private final String [] masteValue={"Черви","Бубны","Пики","Крести"};
    private final String [] levelValue={"Два","Три","Четыре","Пять","Шесть","Семь","Восемь","Девять","Десять","Валет","Дама","Король","Туз"};
    Random position=new Random();

    public QuickCard() {
        this.maste = masteValue[position.nextInt(4)];
        this.Level = levelValue[position.nextInt(13)];
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getMaste() {
        return maste;
    }

    public void setMaste(String maste) {
        this.maste = maste;
    }

    @Override
    public String toString() {
        return Level+" "+maste;
    }
}
