package com.company;

public class Dog {

    public Tail tail;
    private String name;
    private Breed breed;
    public TailName tailName;

    enum Breed {
        LABRADOR_RETRIEVER,
        GERMAN_SHEPHERD,
        GOLDEN_RETRIEVER,
        FRENCH_BULLDOG,
        BULLDOG;

        public static Breed getRandom(){
            return values()[(int) (Math.random() * values().length)];
        }
    }

    enum TailName {
        //https://www.fantasynamegenerators.com/fairy_names.php
        MORNINGSHIMMER,
        RUMPLEFLIP,
        PARSLEYSHINE,
        MOSSBUG,
        BITTERWILLOW,
        SOURSHADOW,
        JELLYBELL;

        public static TailName getRandom(){
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public Dog(String name){
        this.name = name;
        this.tail = new Tail(this);
        this.breed = Breed.getRandom();
    }

    public void wagYourTail() {
        tail.wag();
    }


    public class Tail {

        private Dog dog;
        private String name;
        private TailName tailName;

        public Tail(Dog dog) {
            this.dog = dog;
            this.tailName = TailName.getRandom();
        }

        public void wag(){
            System.out.println("I (" + this.dog.name + ") am wagging my " + this.tailName + " tail! (" + this.dog.breed + ")");
        }
    }
}
