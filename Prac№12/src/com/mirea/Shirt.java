package com.mirea;

public class Shirt {
    private String shirts[];

    public Shirt(String[] arr) {
        shirts = arr;
    }

    public String print(int i) {
        String[] words = shirts[i].split(",");
        StringBuilder builder = new StringBuilder();

        builder.append("ID: ").append(words[0]).append("\n");
        builder.append("Type: ").append(words[1]).append("\n");
        builder.append("Color: ").append(words[2]).append("\n");
        builder.append("Size: ").append(words[3]).append("\n");

        return builder.toString();
    }
}
