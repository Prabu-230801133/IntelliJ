import java.util.Random;
public class main4 {
    public static void main(String[] args){
        Random random=new Random();
        int num1;
        boolean num2;
        double num3;
        num1=random.nextInt(1,7);
        num2=random.nextBoolean();
        num3=random.nextDouble(1,7);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if(num2){
            System.out.println("Heads!");

        }
        else {
            System.out.println("tails");
        }

    }
}
