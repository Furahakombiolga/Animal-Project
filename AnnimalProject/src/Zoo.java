public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal monkey = new Monkey("Momo", 3);

        // Demonstrate method overriding
        lion.makeSound();
        lion.eat();

        elephant.makeSound();
        elephant.eat();

        monkey.makeSound();
        monkey.eat();

        // Demonstrate method overloading and polymorphism
        lion.makeSound(3);
        elephant.eat("leaves");
        monkey.makeSound(2);
    }
}

