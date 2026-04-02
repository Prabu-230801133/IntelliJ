import java.util.*;
//Day 38 in 100days challenge.

public class main22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(",");
        int n = parts.length;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        Arrays.sort(arr);

        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        List<Integer> best = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                List<Integer> curr = new ArrayList<>();
                curr.add(arr[i]);
                curr.add(arr[j]);

                int a = arr[i], b = arr[j];

                while (set.contains(a + b)) {

                    int c = a + b;

                    if (a == 0 && b == 0) {
                        curr.add(0);
                        break;
                    }

                    curr.add(c);
                    a = b;
                    b = c;
                }

                if (curr.size() >= 3 && isBetter(curr, best)) {
                    best = curr;
                }
            }
        }

        for (int x : best) {
            System.out.print(x + " ");
        }
    }

    // Comparison logic as per problem rules
    private static boolean isBetter(List<Integer> a, List<Integer> b) {
        if (b.isEmpty()) return true;

        if (a.size() != b.size()) {
            return a.size() > b.size();
        }

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }
        return false;
    }
}
