package com.example.pinpin;

import java.util.PriorityQueue;

public class Message {
    private String name;
    private String date;
    private String msg;
    private int image_id;
    public Message(String name,String date,String msg,int image_id){
       this.name=name;
        this.date=date;
        this.msg=msg;
        this.image_id=image_id;
    }
    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.date;
    }
    public String getMsg(){
        return this.msg;
    }
    public int getImage_id(){
        return this.image_id;
    }
    public void setDate(String date){
        this.date=date;
    }
    public void setMsg(String msg){
        this.msg=msg;
    }

}
