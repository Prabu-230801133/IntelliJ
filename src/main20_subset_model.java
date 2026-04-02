import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main20_subset_model {
    public static void main(String[] args){
        List<Integer> a=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int numby=scanner.nextInt();
        for(int i=0;i<numby;i++) {
            a.add(scanner.nextInt());
        }

        List<List<Integer>> result=subset(a);
        System.out.println(result);
        
    }
    public static List<List<Integer>> subset(List<Integer> nums){
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:nums){
         int size =res.size();
         for(int i=0;i<size;i++){
             List<Integer> newsub=new ArrayList<>(res.get(i));
             newsub.add(num);
             res.add(newsub);
         }
        }
            return res;
    }
}
