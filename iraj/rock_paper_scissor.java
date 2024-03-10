package iraj;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(3);
//        System.out.println(rand);

        System.out.println("Choose your move:");
        System.out.println("0 for Rock");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissor");
        int userInput = sc.nextInt();
        if(userInput == 0){
            System.out.println("You choose = \"Rock\"");
        }
        else if(userInput == 1){
            System.out.println("You choose = \"Paper\"");
        }
        else if(userInput == 2){
            System.out.println("You choose = \"Scissor\"");
        }
        if(userInput>2 || userInput<0) {
            System.out.println("Invalid Choice!");
        }
        if(rand == 0){
            System.out.println("Computer choose = \"Rock\"");
        }
        else if(rand == 1){
            System.out.println("Computer choose = \"Paper\"");
        }
        else if(rand == 2){
            System.out.println("Computer choose = \"Scissor\"");
        }
        if(userInput == rand){
            System.out.println("Draw");
        }
        else if(userInput == 0 && rand == 1){
            System.out.println("Computer won!");
        }
        else if(userInput == 0 && rand == 2){
            System.out.println("You won!");
        }
        else if(userInput == 1 && rand == 0){
            System.out.println("You won!");
        }
        else if(userInput == 1 && rand == 2){
            System.out.println("Computer won!");
        }
        else if(userInput == 2 && rand == 0){
            System.out.println("Computer won!");
        }
        else if(userInput == 2 && rand == 1){
            System.out.println("You won!");
        }
    }
}
