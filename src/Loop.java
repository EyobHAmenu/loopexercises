import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num1;
        int prod = 0;
        int sum = 0;
        int count = 1;
        String number;
        boolean palindrome = true;

        Scanner sc = new Scanner(System.in);

        /* Prompt user for input,
            display the cube of all numbers up to that bound.
        */
        System.out.print("Enter a boundary: ");
        num1 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            System.out.println("Cube of " + i + " = " + i*i*i);

        }

        /*
            Prompt user for input,
            display the multiplication table for that number up to 10.
         */
        System.out.print("Enter a number: ");
        num1 = sc.nextInt();
        for (int i = 0; i <= 10 ; i++) {
            prod = i * num1;
            System.out.println(i + " x " + num1 + " = " + prod);
        }

        /*
            Prompt user for input,
            output all odd numbers up to that bound and then the sum of those odd numbers.
         */
        System.out.print("Enter a boundary: ");
        num1 = sc.nextInt();
        System.out.print("Odd numbers in the boundary: " );
        for (int i = 0; i <= num1 ; i++) {
            if(i % 2 !=0){
                System.out.print(i + ",");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum of the odd numbers in the boundary: " + sum);
        sum = 0;

        /*
            Prompt user for input,
            output all even numbers up to that bound and then the sum of those odd numbers.
         */
        System.out.print("Enter a boundary: ");
        num1 = sc.nextInt();
        System.out.print("Even numbers in the boundary: ");
        for (int i = 0; i <= num1 ; i++) {
            if(i % 2 ==0){
                System.out.print(i + ",");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum of the Even numbers in the boundary: " + sum);
        sum = 0;


        /*
           6. Prompt user for input,
            use for loop to display triangle.
         */
        System.out.print("Please enter a height for a triangle. ");
        num1 = sc.nextInt();
        System.out.println("Question 6. ");
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println("Question 7.");

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
            count++;
        }
        count = 1;

        System.out.println("Question 8.");
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        count = 0;

        System.out.println("Question 9.");
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    System.out.print(0 + " ");
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    System.out.print(0 + " ");
                }else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }

        //Prompt user for input, determine if that number is a palindrome.
        System.out.println("Question 10.");
        System.out.print("Enter a palindrome number. :");
        sc.nextLine();
        number = sc.nextLine();

        for (int i = 0; i < number.length() / 2 ; i++) {
            if (number.charAt(i) != number.charAt(number.length() - (1+i))){
                palindrome = false;
                break;
            }
        }
        if(palindrome == true){
            System.out.println(number + " is palindrome.");
        } else{
            System.out.println(number + " is not palindrome.");
        }

        /*
            loop through 100-200
            check every number if it's divisible by 9.
            if that true we add the value on sum.
            display the total.
         */
        System.out.println("Question 11.");
        number = "";
        for (int i = 100; i <= 200 ; i++) {
            if (i % 9 == 0){
                sum = sum +i;
                number = number + i + "," ;
            }
        }
        System.out.println("Numbers divisible by 9 between 100-200: " + number +
                "\nSum of these numbers: " + sum);



    }
}
