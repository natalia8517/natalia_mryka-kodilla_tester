package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private boolean isStamped;
    private String name;
    private double width;
    private double height;

    public Stamp(boolean isStamped, String name, double width, double height) {
        this.isStamped = isStamped;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public boolean isStamped() {
        return isStamped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setStamped(boolean stamped) {
        isStamped = stamped;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isStamped, name, width, height);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "isStamped=" + isStamped +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
