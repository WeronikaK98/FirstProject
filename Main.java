package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Kuba";
        int age = 16;
        int option = 2;

        System.out.println("Hello");

        do {
            System.out.println("Whats yor name?");
            System.out.println(name);
        }
        while (name != "Kuba");


        switch (option) {
            case 1:
                System.out.println("Start");
                break;

            case 2:
                System.out.println("How old are you?");
                if (age < 18) {
                    System.out.println(age);
                    System.out.println("You can't play this game.");
                    System.out.println("Come back when you're an adult");
                } else {
                    System.out.println(age);
                    break;
                }



        }
    }
    }
