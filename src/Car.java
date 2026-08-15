public class Car {
    static String power="super.....b!!";
    static int num=1;       //static used because while in constructor those will use the same num instead of different num for each Car
    String name;
    String color;
    int id;

    Car(String name,String colour){
        this.name=name;
        this.color=colour;
        this.id=num;
        num++;

    }
    void play(int n){
        System.out.println("you Drove the "+name+" "+color+" around the track "+n+" times."+"\n power is :"+num+"*"+power);
    }
}
