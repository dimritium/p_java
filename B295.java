import java.util.*;

public class B295 {

    public static void initGraph(List<List<Integer>> adjList, int v) {
        for(int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public static void addEdge(List<List<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
    }

    public static void printGraph(List<List<Integer>> adjList) {
        for(int i = 0; i < adjList.size(); i++) {
            for(int j = 0; j < adjList.get(i).size(); j++)  {
                System.out.print(i + " --> " + adjList.get(i).get(j) + ", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        List< List<Integer> > adjList = new ArrayList<>(v);
        initGraph(adjList, v);
        for(int i = 0; i<v; i++) {
            System.out.println("Enter nodes for creating a vertex");
            int a = sc.nextInt(), b = sc.nextInt();
            addEdge(adjList, a, b);
        }
        printGraph(adjList);
        // System.out.println(adjList);
    }
}