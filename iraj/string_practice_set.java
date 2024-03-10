package iraj;

public class string_practice_set {
    public static void main(String[] args) {
//        String str = "Iraj";
//        String lowerCase = str.toLowerCase();
//        System.out.println(lowerCase);

//        String spaces = "This is nothing.";
//        System.out.println(spaces.replace(" ", "_"));

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
