import java.util.*;
import java.util.function.*;



public class TestMe {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TestMe t = new TestMe();
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(Apple.Color.GREEN, 130));
        apples.add(new Apple(Apple.Color.RED, 150));
        apples.add(new Apple(Apple.Color.GREEN, 130));
        apples.add(new Apple(Apple.Color.RED, 170));
        
        System.out.println(apples.get(1).getWeight());
        // System.out.println(apples.sort(comparing(Apple::getWeight)));
        // System.out.println();
        
        
        
        System.out.println(filter(apples, Apple::isGreen).toString());
        System.out.println(filter(apples, Apple::isWeightGreaterThan).toString());
        System.out.println(filter(apples, (Apple a) -> Apple.Color.RED.equals(a.getColor())).toString());
        System.out.println(filter(apples, (Apple a) -> a.getWeight() < 153 && Apple.Color.RED.equals(a.getColor())).toString());
        sc.close();
    }


    

    public static int add1(int x) {
        return x + 1;
    }

    // public static int comparing(Predicate<Apple>p1, Predicate<Apple>p2) {
        
    // }

    public static List<Apple> filter(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: apples) {
            if(p.test(apple))
                result.add(apple);
        }
        return result;
    }
}
