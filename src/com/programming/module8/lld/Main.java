package com.programming.module8.lld;

public class Main {
    public static void main(String[] args) {
        File file=new File("/file/x.txt");
        System.out.println(file.getDateOfCreation()+file.getAbsolutePath());
        file.copy("files/y.txt");
        file.addContent("my content ");
        System.out.println(file.getContent());
        String res=file.copy("/file/");
        System.out.println(res);
        File file1=new File("/file/y.txt");
        System.out.println(File.getCount());
        String s1="kajal";
        String s2="tiwari";
        s1=s2;
        System.out.println(s1);

    }
}
