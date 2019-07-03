import java.util.*;

public class HE1 {
    static class Node {
        int val;
        int key;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
    }
    public static void initTree(List<List<Node>>tree, int n) {
        for(int i = 0; i < n; i++) {
            tree.add(new ArrayList<Node>());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Node>> tree = new ArrayList<List<Node>>();
        int n = sc.nextInt(), k = sc.nextInt();
        initTree(tree, n);
        Node nodes[] = new Node[n];
        
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i, sc.nextInt());
        }
        
        for(int i = 0; i < n-1; i++) {
            int u = sc.nextInt(), v =sc.nextInt();
            tree.get(u-1).add(nodes[v-1]);
            tree.get(v-1).add(nodes[u-1]);
        }

        int val[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int visited[] = new int[n];
            for(List<Node> node : tree) {

            }
        }
    }
}