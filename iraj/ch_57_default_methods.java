package iraj;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Namaste!");
    }
    default void screenOff(){
        greet();
        System.out.println("Screen going to off..");
    }
}

interface myWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling.." + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class MySmartPhone extends MyCellPhone implements myWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap..");
    }
    public void recordVideo(){
        System.out.println("Taking video..");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"MyWordlink2G", "MyWordlink5G", "Vianet"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
}

public class ch_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.screenOff();
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("Vianet");
    }
}
