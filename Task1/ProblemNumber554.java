import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemNumber554 {

    public static void findPifagorTriplets(int n) {

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {

                    if (((a <= b) && (b <= c))
                            && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,
                                    2))) {
                        System.out.printf("a= %d, b= %d, c= %d\n", a, b, c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number:");
            while (true) {
                n = Integer.parseInt(br.readLine());
                if (n < 1) {
                    System.out.println("Enter the positive number:");

                } else {
                    findPifagorTriplets(n);
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("I/O Error.");
        }
    }

}