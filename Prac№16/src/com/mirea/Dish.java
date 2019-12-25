package com.mirea;

public final class Dish implements Item {
    private final double COST;
    private final String NAME;
    private final String DESCRIPTION;

    public Dish(String name, String description) {
        checkString(name, description);

        this.NAME = name;
        this.DESCRIPTION = description;
        this.COST = 0.0;
    }

    public Dish(double cost, String name, String description) {
        checkString(name, description);

        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be less than zero.");
        }
        this.COST = cost;
        this.NAME = name;
        this.DESCRIPTION = description;
    }

    @Override
    public double getCOST() {
        return COST;
    }

    @Override
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    private void checkString(String ... arr) {
        for (String str : arr) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The string should not be empty.");
            }
        }
    }
}
