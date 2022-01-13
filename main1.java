package com.lab1.task1;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.color = "Black";
        monitor1.dimension = 25;
        monitor1.resolution = 720;

        Monitor monitor2 = new Monitor();
        monitor2.color = "White";
        monitor2.dimension = 30;
        monitor2.resolution = 1080;

        if (monitor1.color.equals(monitor2.color)) {
            System.out.println("The monitors are the same color");
        } else {
            System.out.println("The monitors have different colors");
        }

        if (monitor1.dimension > monitor2.dimension) {
            System.out.println("The first monitor is bigger");
        } else {
            System.out.println("The second monitor is bigger");
        }

        if (monitor1.resolution > monitor2.resolution) {
            System.out.println("The first monitor has a higher resolution");
        } else {
            System.out.println("The second monitor has a higher resolution");
        }
    }
}