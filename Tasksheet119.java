/*

	T A S K   S H E E T   1 1 9
	27 / 08 / 24

*/

package javaLessonActivities;
import java.util.Scanner;

public class tasksheet119 {
    public static void main(String[] args) {
        float x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Please input first number: ");
        x = input.nextFloat();

        System.out.print("Please input second number: ");
        y = input.nextFloat();
		
		input.close();

        Calculator calc = new Calculator(x, y);
		
		System.out.println();

        calc.showSum();
        calc.showDiff();
        calc.showProd();
        calc.showQuot();
		
		System.out.println();
		
    }
}

class Calculator {
    private float firstNumber, secondNumber;
    private boolean divideByZeroCheck = false;

    // Constructor
    Calculator(float a, float b) {
        firstNumber = a;
        secondNumber = b;
    }

    // Method to get the sum
    private float getSum() {
        return firstNumber + secondNumber;
    }

    // Method to get the difference
    private float getDiff() {
        return firstNumber - secondNumber;
    }

    // Method to get the product
    private float getProd() {
        return firstNumber * secondNumber;
    }

    // Method to get the quotient
    private float getQuot() {
        if (secondNumber == 0) {
            divideByZeroCheck = true;
            return Float.NaN;
        } else {
            return firstNumber / secondNumber;
        }
    }

    // Method to show the sum
    public void showSum() {
        System.out.println("Sum: " + getSum());
    }

    // Method to show the difference
    public void showDiff() {
        System.out.println("Difference: " + getDiff());
    }

    // Method to show the product
    public void showProd() {
        System.out.println("Product: " + getProd());
    }

    // Method to show the quotient
    public void showQuot() {
        float quotient = getQuot();
        
        if (divideByZeroCheck == true) {
            System.out.println("Quotient: UNDEFINED (Division by zero)");
        } else {
            System.out.println("Quotient: " + quotient);
        }
    }
}


