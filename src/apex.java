import java.util.*;

public class apex {
    static long maxApex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (!sc.hasNextLine()) return;
        String line = sc.nextLine();
        // Split by commas or spaces to handle different input formats
        String[] parts = line.split("[,\\s]+");

        int[] nums = new int[n];
        int count = 0;
        for (String part : parts) {
            if (!part.isEmpty() && count < n) {
                nums[count++] = Integer.parseInt(part.trim());
            }
        }

        boolean[] used = new boolean[n];
        int[] currentBase = new int[6];

        // Find all permutations of 6 elements from the N provided
        findMax(nums, used, currentBase, 0);

        System.out.println(maxApex);
    }

    /**
     * Recursive function to generate permutations of size 6
     */
    static void findMax(int[] nums, boolean[] used, int[] currentBase, int depth) {
        if (depth == 6) {
            calculateApex(currentBase);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentBase[depth] = nums[i];
                findMax(nums, used, currentBase, depth + 1);
                used[i] = false;
            }
        }
    }

    /**
     * Calculates the apex value for a specific base arrangement
     */
    static void calculateApex(int[] b) {
        // According to Pascal's triangle logic for 6 base elements:
        // Row 5 Left (L) = 1*b0 + 4*b1 + 6*b2 + 4*b3 + 1*b4
        // Row 5 Right (R) = 1*b1 + 4*b2 + 6*b3 + 4*b4 + 1*b5

        long left = (long)b[0] + 4L*b[1] + 6L*b[2] + 4L*b[3] + (long)b[4];
        long right = (long)b[1] + 4L*b[2] + 6L*b[3] + 4L*b[4] + (long)b[5];

        long apex = left * right;
        if (apex > maxApex) {
            maxApex = apex;
        }
    }
}