import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // First term
        int b = sc.nextInt(); // Number of terms
        int c = sc.nextInt(); // Common ratio
 if (b <= 0) {
            System.out.println("It is not possible");
            return;
        }

        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
            a = a * c;
        }
        sc.close();
    }
}
