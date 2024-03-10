package iraj;
import java.util.Scanner;
class Game{
    private int count = 0;
    private int userNo, compNo;

    public Game() {
        compNo = (int) (Math.random() * 100);
    }
        public void setNumber(int n){
        userNo = n;
        }
        public int isCorrect(){
        if (userNo == compNo){
            return 0;
        }
        else if (userNo > compNo){
            return 1;
        }
        else {
            return -1;
        }
        }
    public void setCount(){
        count++;
    }
    public void getCount(){
        System.out.println("Congratulation! You have guessed correct number in " + count + " try.");
    }
    }
public class guessTheNo_usingConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game obj = new Game();
        System.out.println("Enter a number to guess between 0-100:");
        while(true){
            int n = sc.nextInt();
            obj.setNumber(n);
            if (obj.isCorrect()==0) {
                obj.setCount();
                obj.getCount();
                break;
            }
            else if (obj.isCorrect()==1){
                System.out.println("Enter lower number.");
                obj.setCount();
            }
            else if(obj.isCorrect()==-1){
                System.out.println("Enter higher number.");
                obj.setCount();
            }
        }
    }
}