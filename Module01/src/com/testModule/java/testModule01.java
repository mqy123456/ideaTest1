package com.testModule.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class testModule01 {
    private String name;
    private String adress;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static int getCTRLSHIFTY() {
        return CTRLSHIFTY;
    }

    public static void setCTRLSHIFTY(int CTRLSHIFTY) {
        testModule01.CTRLSHIFTY = CTRLSHIFTY;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    static int CTRLSHIFTY=10;
    public static void main(String[] args) {
        System.out.println("lalalal");
        ArrayList list = new ArrayList();
        list.add(8);

    }
//设置注释

    /**
     * 设置注释
     */
    public void method() {
        String s = "ss";
        Date date = new Date();
        ArrayList<Object> list = new ArrayList<>();
        list.add(5);
        try {
            FileInputStream stream=new FileInputStream("t.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] ss =new String[]{"tom","tony"};
        for (String s1 : ss) {
            System.out.println(s1);
        }
    }
}
