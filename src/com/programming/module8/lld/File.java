package com.programming.module8.lld;

import java.util.Date;
/*
File entity
 */
public class File {
    private static int COUNT_OF_INSTANCES=0;
    private String absolutePath;
    private double size;
    private Date dateOfCreation;
    private String content;
    private int num;

    public File(String absolutePath) {
        this.absolutePath = absolutePath;
        this.size = 0;
        this.dateOfCreation = new Date();
        this.content = "";
        COUNT_OF_INSTANCES++;
    }
    public File(String absolutePath, int num){
        this(absolutePath);
        this.num=num;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public double getSize() {
        return size;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getContent() {
        return content;
    }
    public void rename(String name){
        //logic to rename
    }
    public String copy(String path){
        if (isValid(path)) {
            if (this.size > 10) {
                return "cannot copy";
            }
            return "copy successful";
        }
        else {
            return  "invalid path";
        }
    }
    public void addContent(String content){
        this.content+=content;
        this.size+=content.length();
    }
    private boolean isValid(String path){
        if(path.length()>0){
            return true;
        }
        return false;
    }
    public static int getCount(){
        return COUNT_OF_INSTANCES;
    }
}

/*
PUBLIC - accessible from everywhere
PRIVATE - only accessible within class
PROTECTED - accessible within the class, within the package and to child classes inheriting
DEFUALT - PROTECTED - within the child class
 */

