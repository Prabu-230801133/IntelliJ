import java.util.Scanner;
import java.util.*;

public class main18_products {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Product<String,Integer> product1=new Product<>("Noodles",500);
        Product<String,Integer> product2=new Product<>("briyani",600);
        System.out.println(product1.getPrice());

                Scanner sc = new Scanner(System.in);
                ArrayList<Product<String, Integer>> products = new ArrayList<>();

                System.out.print("Enter number of products: ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {

                    System.out.println("\nProduct " + (i + 1));

                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();

                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    sc.nextLine(); // consume newline

                    products.add(new Product<>(item, price));
                }
                System.out.println("\n--- Product List ---");
                for (Product<String, Integer> p : products) {
                    System.out.println("Item: " + p.getItem() +", Price: " + p.getPrice());
                }
    }
}