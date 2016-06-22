import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {
        Scanner userinput = new Scanner(System.in);
        Maths math = new Maths();
        float num1, num2;
        String operation;

        System.out.print("Enter the first number: ");
        num1 = userinput.nextFloat();
        System.out.print("Enter operation to perform (+,-,x,/): ");
        operation = userinput.next();
        System.out.print("Enter the second number: ");
        num2 = userinput.nextFloat();

        switch (operation) {
            case "+":
                System.out.print(math.Add(num1, num2));
                break;
            case "-":
                System.out.print(math.Subtract(num1, num2));
                break;
            case "*":
                System.out.print(math.Multiply(num1, num2));
                break;
            case "/":
                System.out.print(math.Divide(num1, num2));
                break;
            default:
                System.out.print("The operation is not valid.");
        }
    }
}