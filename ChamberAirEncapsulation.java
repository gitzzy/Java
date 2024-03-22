import java.util.Scanner;

public class ChamberAirEncapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int N = scanner.nextInt();

        // Input array elements
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // Calculate total encapsulated air
        int totalAir = calculateEncapsulatedAir(heights);

        // Output the result
        System.out.println(totalAir);

        scanner.close();
    }

    public static int calculateEncapsulatedAir(int[] heights) {
        int n = heights.length;
        if (n <= 2) return 0; // Not enough walls to encapsulate air

        int totalAir = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        for (int i = 0; i < n; i++) {
            totalAir += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return totalAir;
    }
}
