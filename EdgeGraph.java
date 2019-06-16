import java.util.*;

public class EdgeGraph {

    public static void initGraph( List<List<Integer>> graph, int n ) {
        for(int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public static void addEdge( List<List<Integer>> graph, int a, int b ) {
        graph.get(a).add(b);
    }

    public static boolean isEdge( List<List<Integer>> graph, int a, int b ) {
        if(graph.get(a).contains(b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        initGraph(graph, n);
        while(m-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            addEdge(graph, a, b);
        }

        int q = sc.nextInt();
        while(q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(isEdge(graph, a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}