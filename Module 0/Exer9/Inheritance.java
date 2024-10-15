public class Inheritance {
    public static void main(String[] args) {
       Feline newFeline = new Feline(); 
       Feline newCat = new Cat();
       Feline newTiger = new Tiger();

       newFeline.saySomething();
       newCat.saySomething();
       newTiger.saySomething();
    }
}

class Feline {
    public void saySomething() {
       System.out.println("The feline is making a sound"); 
    }
}

class Cat extends Feline {
    
}

class Tiger extends Feline {
    public void saySomething() {
        System.out.println("Rawrrr!!");
    }
}
