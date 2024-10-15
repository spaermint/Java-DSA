import java.util.Scanner;

public class Exer1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Please choose a room: 1 = Kitchen, 2 = Bathroom, 3 = Bedroom");
        num = input.nextInt();
        displayRoom(num);
    }

    public static void displayRoom(int num) {
         if (num == 1) {
             System.out.println("You are in the Kitchen, wash some dishes!");
         } else if (num == 2) {
             System.out.println("You are in the Bathroom, take a bath, you smell!");
         } else if (num == 3) {
             System.out.println("You are in the Bedroom, bro, go out and touch some grass!");
         } else {
             System.out.println("That's not a room number!");
         }
    }
}
