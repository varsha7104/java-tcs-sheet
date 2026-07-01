import java.util.*;

class SortAscending {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value of n:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}