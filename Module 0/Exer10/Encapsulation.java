public class Encapsulation {
    public static void main(String[] args) {
        Https newStatus = new Https();

        newStatus.setResponse(404);
        newStatus.getResponse();
    }
}

class Https {
    private int response;

    public void setResponse(int newResponse) {
        response = newResponse;
    }

    public void getResponse() {
        if (response <= 200) {
            System.out.println("Web Page successfully load!");
        } else if (response >= 404) {
            System.out.println("Web Page not found :< ");
        }
    }
}
