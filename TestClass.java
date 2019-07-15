import java.io.*;
import java.util.*;


public class TestClass {
    public static void initTree(List<List<Integer>>tree, int n) {
        for(int i = 0; i < n; i++) {
            tree.add(new ArrayList<Integer>());
        }    
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        List<List<Integer>> tree = new ArrayList<List<Integer>>();
        initTree(tree, N);
        for(int i=0; i<N; i++)
        {
            arr[i] = sc.nextInt();;
        }

        for(int i=0; i<N-1; i++)
        {
            int U = sc.nextInt();
            int V = sc.nextInt();
            //Process Edges
            tree.get(U-1).add(V-1);
            tree.get(V-1).add(U-1);
        }

    }
}