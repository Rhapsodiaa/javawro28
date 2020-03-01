package com.sda.exercises;

public class Computer implements Comparable<Computer>{
    private String name;
    private int cores;

    public Computer(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }

    public String getName() {
        return name;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public int compareTo(Computer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }
}
