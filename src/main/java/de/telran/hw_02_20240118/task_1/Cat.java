package de.telran.hw_02_20240118.task_1;

    public class Cat extends Pet {
        private boolean isLasy;
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound(){
            System.out.println(getName() +  " издает звук мяу-мяу");
        }

        public void behaviour(){
            System.out.println(getName() + " ловит мышей");
        }
    }
