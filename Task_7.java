public class Task_7 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nИспользованное время на создание строки из 10000 символов '=' с использованием класса String: "
            + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder modifiedStr = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            modifiedStr.append("=");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Использованное время на создание строки из 10000 символов '=' с использованием класса StringBuilder: "
            + (endTime - startTime) + " ms");

        String initialString = "'='";
        StringBuilder modifiedString = new StringBuilder(initialString);

        int index = initialString.indexOf("=");
        endTime = System.currentTimeMillis();
        modifiedString.replace(index, index + 1, "равно");
        System.out.println("Использованное время для замены символов '=' на слово 'равно' с использованием класса StringBuilder.replace().: "
        + (endTime - startTime) + " ms");
    }
}
