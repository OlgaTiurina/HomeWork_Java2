public class Task_6 {
    public static void main(String[] args) {
        String initialString = "'='";
        StringBuilder modifiedString = new StringBuilder(initialString);

        int index = initialString.indexOf("=");
        modifiedString.replace(index, index + 1, "равно");

        System.out.println("\nИзначальный вариант: " + initialString);
        System.out.println("Измененный вариант: " + modifiedString);
    }
    
}
