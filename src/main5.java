import java.util.Scanner;
public class main5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       /*String name="coolie power house";
       int length=name.length();
       char letter=name.charAt(0);
       int index=name.indexOf(" ");
       int lastindex=name.lastIndexOf(' ');
       name=name.toUpperCase();
       System.out.println(length+" "+letter+" "+name);
        System.out.println(index);
        System.out.println(lastindex);

        */
        System.out.print("Enter your email: ");
        String email=scanner.nextLine();

        if(email.contains("@")){
            String username=email.substring(0,email.indexOf('@'));
            String domain=email.substring(email.indexOf('@')+1);
            System.out.println(username+"\n"+domain);
        }
        else{
            System.out.println("this is not an valid email!");
        }

        scanner.close();
    }
}