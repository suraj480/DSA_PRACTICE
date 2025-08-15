package patterens;

public class halfPyramidRotated {
    public static void main(String[] args) {
        int n = 10;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Print spaces (decreasing as i increases)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // New line
            System.out.println();
        }
    }
}
