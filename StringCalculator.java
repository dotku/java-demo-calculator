import java.util.Scanner;

public class StringCalculator {
    public static void main(String args[]) {
        Scanner userinput = new Scanner(System.in);
        Maths math = new Maths();
        Float num1 = new Float("1.1");
        Float num2 = new Float("1.1");
        String operation = "";
        /*
        System.out.print("Enter the first number: ");
        num1 = userinput.nextFloat();
        System.out.print("Enter operation to perform (+,-,x,/): ");
        operation = userinput.next();
        System.out.print("Enter the second number: ");
        num2 = userinput.nextFloat();
        */
        System.out.print("Enter the math question: ");
        String aMathString = userinput.nextLine();
        String[] aMathArray = aMathString.split(" ");
        num1 = new Float(aMathArray[0]);
        operation = aMathArray[1];
        num2 = new Float(aMathArray[2]);
        // if (aMathString != "") {
        // System.out.println(aMathArray[1]);

        //}
        ///*
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
        //*/
    }
}