package com.sound.weblog.entity;

public class TestUser {
    private int id;

    private String name;

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

    @Override
    public String toString() {
        return "TEST{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
