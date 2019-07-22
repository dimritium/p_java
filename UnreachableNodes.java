import java.util.*;

public class UnreachableNodes {
    static int snodes = 0;
    static void initGraph(List<List<Integer>> graph, int n) {
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    static int countNodes(List<List<Integer>> graph, Stack<Integer>stack, boolean visited[]) {
        if(stack.isEmpty())
            return snodes;

        int cn = stack.pop();
        if(!visited[cn]) {
            visited[cn] = true;
            snodes++;
        }

        for(int i = 0; i < graph.get(cn).size(); i++) {
            if(!visited[graph.get(cn).get(i)]) {
                stack.add(graph.get(cn).get(i));
                countNodes(graph, stack, visited);
            }
        }
        return snodes;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int u, v, x, cnodes;
        int nodes[] = new int[1];
        nodes[0] = 0;

        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean[n+1];
        initGraph(graph, n);
        while(m-- > 0) {
            u = sc.nextInt();
            v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        x = sc.nextInt();
        stack.add(x);
        cnodes = countNodes(graph, stack, visited);

        System.out.println(n - cnodes);
        sc.close();
    }
}