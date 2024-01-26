package de.telran.hw_02_20240118.task_1;

    public class Dog extends Pet {
        private boolean isSecurity;
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound(){
            System.out.println(getName() + " издает звук гав-гав");
        }


        public void secure(){
            System.out.println(getName() + " охраняет");
        }


    }
