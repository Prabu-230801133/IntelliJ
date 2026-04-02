import java.util.*;
//Day 35 in 100days challenge.
public class main21{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int count=0;
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) matrix[i][j]=scanner.nextInt();
        }
        for(int rows=0;rows<m-1;rows++){
            for(int columns=0;columns<n-1;columns++){
                if(matrix[rows][columns]%coun(matrix[rows][columns])==0) count++;
                if(matrix[rows][columns+1]%coun(matrix[rows][columns+1])==0) count++;
                if(matrix[rows+1][columns]%coun(matrix[rows+1][columns])==0) count++;
                if(matrix[rows+1][columns+1]%coun(matrix[rows+1][columns+1])==0) count++;

                if(count==4) pri(matrix, rows, columns);
//                pri(matrix,rows,columns);
                count=0;
            }
        }
        scanner.close();
    }
    public static void pri(int[][] mat, int m,int n){
        for(int i=m;i<=m+1;i++){
            for(int j=n;j<=n+1;j++) System.out.print(mat[i][j]+" ");

            System.out.println();
        }
    }
    public static int coun(int a){
        int sum=0;
        while(a>0){
            sum+=(a%10);
            a/=10;
        }
        return sum;
    }
}