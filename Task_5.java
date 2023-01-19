public class Task_5 {
    public static void main(String[] args) {
        String initialString = "'='";
        StringBuilder modifiedString = new StringBuilder(initialString);

        int index = initialString.indexOf("=");
        modifiedString.deleteCharAt(index);
        modifiedString.insert(index, "'равно'");

        String newString = modifiedString.toString();
        System.out.println("\nИзначальный вариант: " + initialString);
        System.out.println("Измененный вариант: " + newString);
    }
    
}
