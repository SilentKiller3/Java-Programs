package iraj;
import javax.print.Doc;
class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    EkClass(){
        System.out.println("Default constructor");
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
    super(c);
    System.out.println("I am a constructor");
    }
}
public class this_and_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        DoClass c = new DoClass(10);
        System.out.println(e.getA());
    }
}
