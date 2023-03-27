import java.util.Scanner;

public class CalculatorProgram      // Declaring public class as the name of the CalculatorProgram
{
    public static void main(String[] arguments)     // Executing the main function of arguments array space without return value
    {
        System.out.print("Enter the first number: ");       // Printing a message that user receives a number input
        Scanner n1;     // Creating an object number
        n1=new Scanner(System.in);      // Be entered 'n1'

        Integer first;      // Create variable 'first' in string form
        first= n1.nextInt();        // Entering and return the variable 'n1' in the variable 'first'

        System.out.print("Enter the second number: ");       // Printing a message that user receives a number input
        Scanner n2;     // Creating an object number
        n2=new Scanner(System.in);      // Be entered 'n2'

        Integer second;      // Create variable 'second' in string form
        second= n2.nextInt();        // Entering and return the variable 'n2' in the variable 'second'

        System.out.print("1: +\n2: -\n3: *\n4: %\nEnter the number: ");       // Printing a message that user receives a number input
        Scanner n;     // Creating an object number
        n=new Scanner(System.in);      // Be entered 'n'

        Integer selector;      // Create variable 'selector' in string form
        selector= n.nextInt();        // Entering and return the variable 'n' in the variable 'selector'

        System.out.print("Enter an operator: ");       // Printing a message that user receives an operator input
        Scanner op;     // Creating an object operator
        op=new Scanner(System.in);      // Be entered 'op'

        String operator;      // Create variable 'operator' in string form
        operator= op.next();        // Entering and return the variable 'n1' in the variable 'first'

        switch (selector)       // Switch Grammar Execution
        {
            case 1: operator = "+";     // If selector is 1, operator is '+'
                    System.out.println(first+operator+second+"="+(first+second));       // Result Output
                    break;      // Aborting

            case 2: operator = "-";     // If selector is 2, operator is '-'
                    System.out.println(first+operator+second+"="+(first-second));       // Result Output
                    break;      // Aborting

            case 3: operator = "*";     // If selector is 3, operator is '*'
                    System.out.println(first+operator+second+"="+(first*second));       // Result Output
                    break;      // Aborting

            case 4: operator = "/";     // If selector is 4, operator is '/'
                    System.out.println(first+operator+second+"="+(first/second));       // Result Output
                    break;      // Aborting
        }

    }
}
