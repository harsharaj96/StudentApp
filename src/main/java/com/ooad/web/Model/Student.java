/*
 * Created by Sandeep Tadepalli on 20/01/18 23:11
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.Model;

//Created by Harsha Raj on 20-01-2018

public class Student {
    private final int id;
    private final String name;
    private final int marks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    private final String imageUrl;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getImageUrl() {
        return imageUrl;
    }


    public Student(int id, String name, int marks, String imageUrl) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.imageUrl = imageUrl;
    }
}
