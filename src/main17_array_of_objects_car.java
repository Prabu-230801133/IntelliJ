import java.util.Scanner;

public class main17_array_of_objects_car {
    public static void main(String[] args){
        Car car1;
        Scanner scanner=new Scanner(System.in);
        car1=new Car("Audi01","Gold"); 
        car1.play(5);
        Car car2=new Car("BMW","Blue");
        car2.play(4);
        Car car3=new Car("LAMBO","RED");
        car3.play(10);
        System.out.println("Total cars: "+Car.num);


        int n;
        Car[] cars;
        System.out.print("Enter the number of cars: ");
        n=scanner.nextInt();
        scanner.nextLine();
        cars=new Car[n];


        for(int i=0;i<n;i++){
            System.out.print("Car"+i+1+" name: ");
            String name=scanner.nextLine();
            System.out.print("Car"+i+1+" colour: ");
            String colour=scanner.nextLine();
            cars[i]=new Car(name,colour);
        }

        for (Car c:cars){
            c.play(n);

        }

    }

}
