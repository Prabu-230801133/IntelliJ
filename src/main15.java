import java.util.Scanner;

public class main15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int row,column;
        int[][] matrix;
        System.out.print("Enter the # of rows : ");
        row=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the # of columns : ");
        column=scanner.nextInt();
        scanner.nextLine();
        matrix=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("Enter the number to enter into position(%d,%d) :  ",i+1,j+1);
                matrix[i][j]=scanner.nextInt();
            }
        }
        //to print the 2d array
        System.out.println("The Matrix is : ");
        for(int[] a:matrix){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        //different method to print
        System.out.println("--------or -------");
        for (int i=0;i<matrix.length;i++){
            for(int a:matrix[i]){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
