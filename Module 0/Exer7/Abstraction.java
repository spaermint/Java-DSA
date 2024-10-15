public class Abstraction {
    public static void main(String[] args) {
        Feline Siamese = new Cat();
        Feline Bengal = new Tiger();

        Siamese.saySomething();
        Bengal.saySomething();
    }
}

abstract class Feline {
    abstract void saySomething();
}

class Cat extends Feline {
    void saySomething() {
        System.out.println("Meowww!!");
    }
}

class Tiger extends Feline {
    void saySomething() {
        System.out.println("Rawrrrr!!");
    }
}
