import java.util.Scanner;
public class main14varargs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = {1, 2, 3, 5,44,5,8};
        System.out.print("The array is : ");
        for(double e:nums){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Square : "+square(nums));
        System.out.println("Cube : "+cube(nums));
        double res = differ(square(nums),cube(nums));
        System.out.print("Cube - square : "+res);

    }

    static double square(double... nums) {
        double sum = 0;
        for (double a : nums) {
            sum += Math.pow(a, 2);
        }
        return (sum);
    }

    static double cube(double... nums) {
        double sum = 0;
        for (double a : nums) {
            sum += Math.pow(a, 3);
        }
        return (sum);
    }

    static double differ(double a,double b) {

        return (b-a);
    }
}