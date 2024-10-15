public class Feline {
    public static void main(String[] args) {
       Cat Siamese = new Cat("Siamese", "Small-Medium", 10, "Grayish-Black"); 

       System.out.println("The breed of this cat is " + Siamese.catBreed);
       System.out.println("The average size of this cat is " + Siamese.catSize);
       System.out.println("Its life span is about " + Siamese.catAge + " years");
       System.out.println("The usual color of this breed is " + Siamese.catColor);
    }
}

class Cat{
    String catBreed;
    String catSize;
    int catAge;
    String catColor;

    Cat(String breed, String size, int age, String color) {
        catBreed = breed;
        catSize = size;
        catAge = age;
        catColor = color;
    }
}
