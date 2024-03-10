package iraj;
class Cylinder{
    private int radius;
    private int height;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }


}
public class practice_ch_9 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setRadius(5);
        obj.setHeight(10);
        System.out.println("Radius= " + obj.getRadius());
        System.out.println("Height= " + obj.getHeight());
        System.out.println("Volume= " + obj.volume());
    }
}
