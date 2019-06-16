import java.util.*;

public class TemplCheck {
    public static <T extends String> T dosmth(T a) {
        return a + a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "ss";
        System.out.println(dosmth(a));
    }
}