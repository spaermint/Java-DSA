public class DemoConstructor {
    public static void main(String[] args) {
        Pi firstNum = new Pi();
        double secondNum = 3, sum;


        System.out.println("The value of pi is: " + firstNum.pi);
        System.out.println("The value of the second num is: " + secondNum);

        sum = firstNum.pi + secondNum;
        System.out.println("Pi plus the second num is equals to " + sum);
    }
}

class Pi {
    double pi;
    Pi(){
        pi = 3.14;
    }
}
