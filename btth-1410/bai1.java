class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}

public class bai1 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Milo"),
            new Cat("Tom")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
