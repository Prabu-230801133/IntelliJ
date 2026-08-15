import java.util.*;

public class main24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<t;i++){
            lis.add(new ArrayList<>());
        }
        int num=1;
        for(int i=0;i<t;i++){
            for(int j=0;j<t-i;j++){
                lis.get(j).add(num++);
            }
        }
        for(List<Integer> l:lis){
            for(int i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
