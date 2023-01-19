public class Task_3 {
    public static String invertedLine(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return invertedLine(str.substring(1)) + str.charAt(0);
    }

public static void main(String[] str) {
    String input = "";
    if (input.length() > 0)
      System.out.println("\nПеревернутая строка " + input + " имеет следующий вид " + invertedLine(input));
    else
      System.out.println("\nПустая строка ");
}
    
}
