package iraj;

class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
public class inheritance_exercise {
    public static void main(String[] args) {
        Circle C = new Circle(5);
        System.out.println(C.area());

        Cylinder1 C1 = new Cylinder1(1,1);
        System.out.println(C1.volume());
    }
}
