//WAP to print "Good Morning!" nad "Welcome" continuously
//on the screen in JAVA using Threads.

package iraj;

class Practice13 extends Thread{
    public void run( ){
        while (true){
            System.out.println("Good Morning!");
        }

    }
}class Practice13b extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome!");
        }

    }
}
public class ch_76_threads_practice_set {
    public static void main(String[] args) {

        Practice13 p1 = new Practice13();
        p1.setPriority(6);
        System.out.println(p1.getPriority());

        Practice13b p2 = new Practice13b();
        p2.setPriority(9);
        System.out.println(p2.getPriority());
        
        p1.start();
        p2.start();
    }
}
