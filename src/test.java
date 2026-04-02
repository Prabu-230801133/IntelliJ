import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {

            String[] inp = scanner.nextLine().split(" ");

            char D = inp[0].charAt(0);
            int FM = Integer.parseInt(inp[1]);
            int BM = -Integer.parseInt(inp[2]);
            int T = Integer.parseInt(inp[3]);
            int FBS = Integer.parseInt(inp[4]);
            int BBS = -Integer.parseInt(inp[5]);

            int pos = 0;
            int count = 0;

            // ✅ FIX: infinite oscillation case
            if (FM == -BM && ((FM<FBS)&&(BM>BBS))) {
                System.out.println("Hurray");
                continue;
            }

            while (true) {

                if (D == 'F') {
                    if (pos + FM >= FBS) {
                        int temp = FBS - pos;
                        count += temp * T;
                        pos = FBS;
                        break;
                    }
                    pos += FM;
                    count += FM * T;
                }
                else {
                    if (pos + BM <= BBS) {
                        int temp = pos - BBS;
                        count += temp * T;
                        pos = BBS;
                        break;
                    }
                    pos += BM;
                    count += (-BM) * T;
                }

                D = (D == 'F') ? 'B' : 'F';
            }

            System.out.println(count + " " + D);
        }

        scanner.close();
    }
}