public class main6 {
    public static void main(String[] args){
        //ternary operator
        int num=7;
        String chr=(num>5)? "YES":"NO";
        System.out.println(chr);
        String day="Sat";
        switch(day){
            case "Mon","Tue","Wed","Thu","Fri"-> System.out.println("Weekday!");
            case "Sat","Sun"-> System.out.println("it's weekend!");
        }

    }
}
