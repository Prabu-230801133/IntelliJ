public class Student {
    String name="pat";
    int age;
    double cgpa;
    boolean isStudent;

    Student(String name,int age,double cgpa){             //constructor
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
        this.isStudent=true;

    }
    void isPlaying(){                                   //method inside class
        System.out.println(name+" has age of "+this.age+" is playing!!");   //"this " can be used or not your wish it works the same.
    }
}
