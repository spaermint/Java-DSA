public class Polymorphism {
    public static void main(String[] args) {

        Feline newFeline = new Feline();
        Feline newCat = new Cat();
        Feline newTiger = new Tiger();

        newFeline.felineSound();
        newCat.felineSound();
        newTiger.felineSound();
    }
}

class Feline {
    public void felineSound() {
        System.out.println("The feline is making a sound");
    }
}

class Cat extends Feline {
    public void felineSound() {
        System.out.println("The cat is making a sound: Meow!!");
    }
}

class Tiger extends Feline {
    public void felineSound() {
        System.out.println("The tiger is making a sound: Rawrrr!!");
    }
}

