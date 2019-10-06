import java.util.*;

public class C1214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackb = new Stack<>();

        String s = sc.next();
        for(char c : s.toCharArray()) {
            if( c == '(' )
                stack.push(c);
            else if( !stack.isEmpty() )
                stack.pop();
            else 
                stackb.push(c);
            if(stackb.size() == 2)
                break;
        }
        sc.close();

        if((stackb.size() == 1 && stack.size() == 1) || (stack.isEmpty() && stackb.isEmpty())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}