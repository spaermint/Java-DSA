public class DemoConstructor2 {
    public static void main(String[] args) {
        double pi = 3.14;

        Pi defaultPi = new Pi(pi);
        Pi newPi = new Pi(3.16);

        System.out.println("Default Value of Pi: " + defaultPi.pi);
        System.out.println("Modified Value of Pi: " + newPi.pi);
    }
}

class Pi {
    double pi;
    Pi(double num){
        pi = num;
    }
}
