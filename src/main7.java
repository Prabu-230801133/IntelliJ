import java.util.Scanner;

public class main7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int age;
        String name;
        System.out.print("Enter your Name : ");
        name=scanner.nextLine();

        System.out.print("Enter your age : ");
        age=scanner.nextInt();
        while(age<=0){
            System.out.println(name +" your age can't be less than or equal to zero!");
            System.out.print("Enter your age : ");
            age=scanner.nextInt();
        }

        /*do{
            System.out.println(name +" your age can't be less than or equal to zero!");
            System.out.print("Enter your age : ");
            age=scanner.nextInt();
            }while(age<=0);
            System.out.println(name+" your age is "+age);
            System.out.println(name+" your age is "+age);
             }
         */

    }
}
