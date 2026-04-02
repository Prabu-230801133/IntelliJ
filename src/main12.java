import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        String[] array1={"apple","banana","Falcon","Eagle","flamingo","cutlet","Diamond","Eleven"};
        System.out.println(array1[0]);


        System.out.println("-------or --------");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+",");

        }
        System.out.println();
        Arrays.sort(array1);

        System.out.println("-------or --------");
        for (String a : array1){
            System.out.print(a+",");
        }

        System.out.println();
        System.out.println("-------or --------");

        //to open charmap win+r --> type: "charmap " and hit enter.

        Arrays.fill(array1,"🔥COOLIE🔥");
        for (String a1:array1){
            System.out.print(String.join("-►►", a1));}


        scanner.close();
    }
}
