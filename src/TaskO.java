import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] balls = new int[n];
        for (int i = 0; i < n; i++) {
            balls[i] = scanner.nextInt();
        }
        int currentSize = n;
        boolean found = true;
        while (found) {
            found = false;
            int i = 0;
            while (i < currentSize) {
                int j = i;
                while (j < currentSize && balls[j] == balls[i]) {
                    j++;
                }
                int count = j - i;
                if (count >= 3) {
                    for (int k = j; k < currentSize; k++) {
                        balls[k - count] = balls[k];
                    }
                    currentSize = currentSize - count;
                    found = true;
                    break;
                }
                i = j;
            }
        }
        int destroyed = n - currentSize;
        System.out.println(destroyed);
    }
}