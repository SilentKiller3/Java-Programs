package iraj;
abstract class Pen{
   abstract void write();
   abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing..");
    }
    void refill(){
        System.out.println("Refilling..");
    }
    void changeNib(){
        System.out.println("Changing the Nib..");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class ch_60_ch11Practice {
    public static void main(String[] args) {
        //Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        //Q3
        Human me = new Human();
        me.sleep();

        //Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
        
    }
}
