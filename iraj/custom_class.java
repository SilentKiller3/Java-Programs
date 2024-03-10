package iraj;
class Mobile{
    int price;
    int battery;
    String name;
    public void printDetails(){
        System.out.println(name + " is Rs " + price);
    }
    public int batteryBackup(){
        return battery;
    }
        }
public class custom_class {
    public static void main(String[] args) {
    Mobile samsung = new Mobile();
    Mobile nokia = new Mobile();
    Mobile xaomi = new Mobile();
    samsung.name = "Samsung Galaxy Note 10";
    samsung.price = 12000;
    samsung.battery = 5400;
    nokia.name = "Nokia 120";
    nokia.price = 1500;
    nokia.battery = 6500;
    xaomi.name = "Redmi Note 9 pro max";
    xaomi.price = 35000;
    xaomi.battery = 6000;
    samsung.printDetails();
    nokia.printDetails();
    xaomi.printDetails();
    System.out.println(samsung.batteryBackup());
    }
}
