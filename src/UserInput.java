import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your name");
//        String name = scan.nextLine();
//        System.out.println("Welcome "+ name);
//        System.out.println("Please enter First Number");
//        int num1 = scan.nextInt();
//        System.out.println("Please enter Second Number");
//        int num2 = scan.nextInt();
//        System.out.println("Sum of numbers is "+ (num1+num2));
//        System.out.println("Enter two numbers to perform all the arithmetic operations");
//        int a= scan.nextInt();
//        int b= scan.nextInt();
//
//        System.out.println("Sum is " + (a+b));
//        int a= scan.nextInt();
//        int b= scan.nextInt();
//        int c= scan.nextInt();
//
//        if((a>b)&&(a>c)) {
//            System.out.println("Greatest number is " + a);
//        } else if (b>c) {
//            System.out.println("Greatest number is " + b);
//        }
//        else {
//            System.out.println("Greatest number is " + c);
//        }
        System.out.println("Please enter year");
        int year = scan.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year +" is a Leap Year");
                }
                else{
                    System.out.println(year +" is not a Leap Year");
                }
            }
            else {
                System.out.println(year +" is not a Leap Year");
            }
        }
        else {
            System.out.println(year +" is not a Leap Year");
        }

    }
}
