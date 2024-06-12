import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String text = scanner.nextLine();
        
        String result = "";
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }
        System.out.println("Zamieniony tekst: " + result);
    }
}