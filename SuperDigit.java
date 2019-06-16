import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        char arr[] = n.toCharArray();
        int result = 0;
        for(int i = 0; i < n.length(); i++) {
            result += (Integer.parseInt(Character.toString(arr[i])))%10; 
            result = result > 0 ? result : 1;
        }
        if(k == 1)
            return Integer.parseInt(n);
        else
            return superDigit(Integer.toString(result), k-1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
