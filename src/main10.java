import java.util.Scanner;

public class main10 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter your age : ");
        int age=scanner.nextInt();
        System.out.println( agecheck(age)? "you may sign up!":"you are not qualified!");

    }
    static boolean agecheck(int age){
        return age>=18;
    }
        }
