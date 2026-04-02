public class Car {
    static String power="super.....b!!";
    static int num;       //static used because while in constructor those will use the same num instead of different num for each Car
    String name;
    String color;

    Car(String name,String colour){
        this.name=name;
        this.color=colour;
        num++;

    }
    void play(int n){
        System.out.println("you Drove the "+name+" "+color+" around the track "+n+" times."+"\n power is :"+num+"*"+power);
    }
}
