public class main9 {
    public static void main(String args[]){
        String name="Prabu";
        int age=21;
        desp(name ,age);
        System.out.println(squ(5));
    }
    static void desp(String nam,int age){
        System.out.printf("hi i am the boss! %s\n",nam);
        System.out.printf("I am the king!!! at age %d",age);
        System.out.println();
    }
    static int squ(int a){
        return (a*a);
    }
}
