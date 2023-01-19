public class Task_2 {
    public static boolean rotation(String firstString, String secondString) {
        int len = firstString.length();
        if (len == secondString.length() && len > 0) {
            String invertedSecondString = new StringBuilder(secondString).reverse().toString();
            return firstString.equals(invertedSecondString);
        }
        return false;
    }

public static void main(String[] args) {
    String firstVersion = "Rotation";
    String secondVersion = "noitatoR";

    if (rotation(firstVersion, secondVersion)) {
        System.out.println("\nРезультат: " + secondVersion + " является вращением " + firstVersion);
    }
    else {
        System.out.println("\nРезультат: " + secondVersion + " не является вращением " + firstVersion);
    }
}
    
}
