public class Animal {

        protected String name;
        protected int age;


        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public void makeSound() {
            System.out.println("Animal makes a sound");
        }


        public void displayDetails() {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
        }
    }


    class Dog extends Animal {

        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Woof Woof!");
        }
    }


    class Cat extends Animal {

        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Meow Meow!");
        }
    }


    class Bird extends Animal {

        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Chirp Chirp!");
        }
    }




        public static void main(String[] args) {


            Animal a1 = new Dog("Tommy", 3);
            Animal a2 = new Cat("Kitty", 2);
            Animal a3 = new Bird("Tweety", 1);


            Animal[] animals = {a1, a2, a3};


            for (Animal animal : animals) {
                animal.displayDetails();
                animal.makeSound();
                System.out.println("-------------------");
            }
        }


