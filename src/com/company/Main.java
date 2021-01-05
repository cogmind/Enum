package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Bingo");
        Dog dog3 = new Dog("Dyno");

        dog1.tail.wag();
        dog2.tail.wag();
        dog3.tail.wag();

    }
}
