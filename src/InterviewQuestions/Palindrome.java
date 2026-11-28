package InterviewQuestions;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String name = "lasdfggfdsaL";
        String nameUsed = name.toLowerCase();
        int length= nameUsed.length()-1; int x=0;
        System.out.println(nameUsed);
        char[] charName = nameUsed.toCharArray();
        while(x<=length){
            if(charName[x]==charName[length]){
                x++; length--;
            }
            else {
                System.out.println("String is not an palindrome");
                ;
                return;
            }
        }
        System.out.println("String is Palidrome");

    }
}
