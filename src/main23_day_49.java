import java.util.*;
public class main23_day_49{
    //100days challenge day 49
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<String> arr1=new ArrayList<>();
        int res=1;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            arr.add(scanner.nextInt());
        }
        while(scanner.hasNext()){
            arr1.add(scanner.next());
        }
        for(String i:arr1){
            String[] temp=i.split("");
            int f=0;
            for(int j=0;j<temp.length;j++){
                int a=arr.get(temp[j].toUpperCase().charAt(0)-65);
                f+=a;
                if(a<0 && (j+1>=temp.length ||j==0)){
                    int e=temp[j].toUpperCase().charAt(0)-64;
                    f+=e;
                }
            }
            res*=f;
        }
        System.out.print(res);
    }
}