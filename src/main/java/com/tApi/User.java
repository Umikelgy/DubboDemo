package com.tApi;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 17:26
 */
public class User {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
         return "User [id=" + id + ", name=" + name + "]";
    }
}
