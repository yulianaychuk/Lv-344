import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemNumber178 {

    public static int countAliquot3not5(Integer[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 3 == 0) && (a[i] % 5 != 0)) {
                count++;
            }
        }
        return count;
    }

    public static int countEvenSquares(Integer[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.sqrt(a[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number of elements:");
            n = Integer.parseInt(br.readLine());
            Integer[] a = new Integer[n];
            System.out.printf("Enter %d natural elements:\n", n);
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            System.out
                    .printf("countAliquot3not5(a) %d\n", countAliquot3not5(a));
            System.out.printf("countEvenSquares(a) %d\n", countEvenSquares(a));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("I/O Error.");
        }
    }

}
