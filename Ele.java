import java.util.*;

public class Ele {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = n%5 == 0 ? n/5 : n/5 + 1;
    System.out.println(result);
    }
}