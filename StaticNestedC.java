import java.util.*;

public class StaticNestedC {
    public static class Working {
        private static void isIt() {
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Working works = new Working();
        StaticNestedC.Working.isIt();
    }
}