import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Greet {

    static Locale l;
    static ResourceBundle rb;

    static void loadBundle(Locale l) {
        rb = ResourceBundle.getBundle("language", l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your language");
        System.out.println("Press 1 for English");
        System.out.println("हिन्दी के लिए 2 दबाएँ");
        int choice = sc.nextInt();
        if (choice == 1) {
            l = new Locale("en", "US");
            loadBundle(l);
        } else if (choice == 2) {
            l = new Locale("hi", "IN");
            loadBundle(l);
        }

        System.out.println(rb.getString("askName"));
        String name = sc.nextLine();
        System.out.println("Welcome, " + name);

    }
}
