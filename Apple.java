public class Apple {    
    enum Color {
        GREEN,
        RED
    }
    private Color color;
    private int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static boolean isGreen(Apple apple) {
        if(Color.GREEN.equals(apple.getColor()))
            return true;
        else
            return false;
    }

    public static boolean isWeightGreaterThan(Apple apple) {
        if(apple.getWeight() > 140) 
            return true;
        else
            return false;
    }
    
    // public List<Apple> filter(List<Apple> apples, Predicate<Apple> p) {
    //     List<Apple> result = new ArrayList<>();
    //     for(Apple apple: apples) {
    //         if(p.test(apple))
    //             result.add(apple);
    //     }
    //     return result;
    // }

    @Override
    public String toString() {
        return "Apple [color=" + color + ", weight=" + weight + "]";
    }
}