class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Fox extends Animal {
    void run() {
        System.out.println("Fox runs");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit jumps");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Fox f = new Fox();
        Rabbit r = new Rabbit();

        d.eat();
        d.bark();

        f.eat();
        f.run();

        r.eat();
        r.jump();
    }
}
