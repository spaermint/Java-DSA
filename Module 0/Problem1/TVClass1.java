public class TVClass1 {
    public static void main(String[] args) {
       Tv TV1 = new Tv(1); 

       // Check Current Value (must be 0)
       TV1.getStatus();

       // Set Channel to 40
       TV1.setChannel(40);
       // Set Volume to 5
       TV1.setVolume(5);
       // Get Status of the TV Object
       TV1.getStatus();

       // Created a second TV Object
       Tv TV2 = new Tv(2);
       TV2.setVolume(23);
       TV2.getStatus();
       TV2.setVolume(100);
       TV2.setChannel(100);
       TV2.getStatus();
    }
}

class Tv {
    private int volume;
    private int channel;
    private int tvNumber;

    Tv(int tvNum){
        tvNumber = tvNum;
        volume = 0;
        channel = 0;
    }

    public void getStatus() {
        System.out.println("TV Number: " + tvNumber);

        System.out.println("Volume is at: " + volume); 
        System.out.println("Channel is at: " + channel); 
        System.out.println("\n");
    }

    public void setVolume(int vol) {
        volume = vol;
    }

    public void setChannel(int chan) {
        channel = chan;
    }
}
