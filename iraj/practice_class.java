package iraj;
//Practice 1
class Employee{
    int salary;
    String name;
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
}

//Practice 2
class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

public class practice_class {
    public static void main(String[] args) {
        //Practice 1
        Employee Iraj = new Employee();
        Iraj.salary = 50000;
        Iraj.setName("Iraj Manandhar");
        System.out.println(Iraj.getName());
        System.out.println(Iraj.getSalary());

        //Practice 2
        CellPhone mi = new CellPhone();
        mi.ring();
        mi.vibrate();
    }
}
