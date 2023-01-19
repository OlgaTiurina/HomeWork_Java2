public class Task_1 {
    public static int occurrenceInString(String firstString, String secondString) {
        return firstString.indexOf(secondString);
    }

public static void main(String[] args) {
    String firstString = "Hello, world";
    String secondString = "world";
    System.out.println("\nИндекс вхождения строки " + secondString + " в строку " + firstString + " = " + occurrenceInString(firstString, secondString));
}

}