import java.util.*;

public class C580 {
    static int res = 0;

    static void initGraph(List<List<Integer>> graph, int n) {
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    static void pathsDfs(List<List<Integer>> graph, Stack<Integer> stack, boolean visited[], int cats[], int cat,
            int m) {
        if (stack.isEmpty())
            return;

        int cn = stack.pop();
        visited[cn] = true;

        if (cats[cn] == 1) {
            cat += 1;
        } else {
            cat = 0;
        }

        if (cat > m) {
            return;
        }
        if (graph.get(cn).size() == 1 && visited[graph.get(cn).get(0)]) {
            if (cat <= m)
                res++;
        }
        for (int i = 0; i < graph.get(cn).size(); i++) {
            if (!visited[graph.get(cn).get(i)]) {
                stack.push(graph.get(cn).get(i));
                pathsDfs(graph, stack, visited, cats, cat, m);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        boolean visited[] = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();

        initGraph(graph, n);
        int cats[] = new int[n + 1], cat = 0;
        for (int i = 0; i < n; i++) {
            cats[i + 1] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        stack.push(1);
        pathsDfs(graph, stack, visited, cats, cat, m);
        System.out.println(res);
        sc.close();
    }
}