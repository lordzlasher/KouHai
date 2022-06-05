package com.example.kouhai;

public class Courses {
    private final String name;
    private final String description;
    private final int image;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
    public Courses(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image=image;
    }

}
