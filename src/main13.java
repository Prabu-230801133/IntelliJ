import java.util.Arrays;
import java.util.Scanner;

public class main13 {
    public static void main(String[] args){

        //initializing the array with size

        Scanner scanner=new Scanner(System.in);
        String[] fastfood=new String[4];
        fastfood[0]="Coolie";
        Arrays.fill(fastfood,"maggie");
        System.out.println(fastfood[2]);

        // user input

        int size;
        String[] power;
        System.out.print("Enter the size : ");
        size=scanner.nextInt();
        scanner.nextLine();
        power=new String[size];
        for (int i=0;i<power.length;i++){
            System.out.print("Enter the fast food : ");
            power[i]=scanner.nextLine();

        }
        //printing
        for(String a:power){
            System.out.print(a+" ");
        }


        //Searching through an array!!


        System.out.println();
        System.out.print("Enter the food to search : ");
        String target=scanner.nextLine();
        boolean found=false;
        for(int i =0;i<power.length;i++){
            if (target.equalsIgnoreCase(power[i])){
                System.out.println("Target found at Index : "+i);
                found=true;
            }
        }
        if(!found){
            System.out.println("Target not found!");
        }


    }
}
