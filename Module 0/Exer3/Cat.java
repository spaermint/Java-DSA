public class Cat {
    public static void main(String[] args) {
       Kitten myMiming = new Kitten(); 
       myMiming.sayName("Kuro");
       myMiming.sayMeow();
    }
}

class Kitten {
    String kittyname;

    void sayName(String name){
        kittyname = name;
        System.out.println("Meow!!, my name is " + kittyname + "-nyah! ");
    }
    
    void sayMeow() {
        System.out.println("Meowmeow-ma'meow, meow meow meow meow-meow");
    }
}
