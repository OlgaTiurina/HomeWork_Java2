import java.lang.StringBuilder;

public class Task_4 {
    public static void main(String[] args) {
        StringBuilder operation = new StringBuilder();
        int number1 = 3;
        int number2 = 56;

        operation.append(number1 + " + " + number2 + " = " + (number1 + number2) + "\n");
        operation.append(number1 + " - " + number2 + " = " + (number1 - number2) + "\n");
        operation.append(number1 + " * " + number2 + " = " + (number1 * number2));

        System.out.println("\n" + operation.toString());
    }
    
}
