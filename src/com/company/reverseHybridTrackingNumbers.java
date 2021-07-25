package com.company;

public class reverseHybridTrackingNumbers {
    /*
    How to Reverse a Number in Java

    In this section, we will learn how to reverse a number in Java using while loop, for loop, and recursion.

    To reverse a number, follow the steps given below:

    - First, we find the remainder of the given number by using the modulo(%) operator.
    - Multiply the variable reverse by 10 and add the remainder into it.
    - Divide the number by 10.

    Repeat the above steps until the number becomes 0.

    Given Number       --------------->>>>>>>>>>       Reversed Number
       98765                                                56789

       There are three ways to reverse a number in Java:

       - Reverse a number using while loop
       - Reverse a number using for loop
       - Reverse a number using recursion

       Let's apply the above steps in an example.

       Example

       Suppose we want to reverse the number 1234.

       In this example, we have taken three variables named number(the number to be reversed), remainder(stores the
       remainder), reverse(stores the reverse number) initialized 0.

       Iteration 1:

       number = 1234
       remainder = 1234 % 10 = 4
       reverse = 0 * 10 + 4 = 0 + 4 = 4
       number = 1234/10 = 123

       Now the value of the number and reverse variable is 123 and 4, respectively.

       Iteration 2:

       number = 123
       remainder = 123 % 10 = 3
       reverse = 4 * 10 + 3 = 40 + 3 = 43
       number = 123 / 10 = 12

       Now the value of the number and reverse variable is 12 and 43, respectively.

       Iteration 3:

       number = 12
       remainder = 12 % 10 = 2
       reverse = 43 * 10 + 2 = 430 + 2 = 432
       number = 12 / 10 = 1

       Now the value of the number and reverse variable is 1 and 432, respectively.

       Iteration 4:

       number = 1
       remainder = 1 % 10 = 1
       reverse = 432 * 10 + 1 = 4320 + 1 = 4321
       number = 1 / 10 = 0

       Now the variable number become 0. Hence, we get the reverse number 4321.
       Let's implement the above logic in a Java program.

       Reverse a number using while loop

       ReverseNumberExample1.java

       public class ReverseNumberExample1
       {
       public static void main (String[] args)
       {
       int number = 987654, reverse = 0;
       while(number != 0)
       {
       int remainder = number % 10;
       reverse = reverse * 10 + remainder;
       number = number / 10;
       }
       System.out.println("The reverse of the given number is:" + reverse);
       }
       }

       output:
       The reverse of the given number is: 456789

       Reverse a number using for loop

       In the following program, we have replaced the while loop by a for loop. It also removes the last digit of the
       number, after each iteration. When the condition, number != 0 becomes false, the loop exits and we get the
       reversed number.

       ReverseNumberExample2.java

       public class ReverseNumberExample2
       {
       public static void main(String[] args)
       {
       int number = 123456. reverse = 0;
       // we have not mentioned the initialization part of the for loop
       for(;number != 0; number = number / 10)
       {
       int remainder = number % 10;
       reverse = reverse * 10 + remainder;
       }
       System.out.println("The reverse of the given number is: " + reverse);
       }
       }

       Output:
       The reverse of the given number is: 654321

       In the above program, we can also write the for loop as follows:

       for(;number != 0;)
       {
       int remainder = number % 10;
       reverse = reverse * 10 + remainder;
       number = number / 10;
       }



     */
}
