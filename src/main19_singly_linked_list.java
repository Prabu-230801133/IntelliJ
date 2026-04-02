public class main19_singly_linked_list {
    public static void main(String[] args){
        Linlist lis=new Linlist();
        lis.insertfirst(5);
        lis.insertfirst(9);
        lis.insertlast(12);
        lis.insert(4,5);
        lis.insert(8,12);
        lis .insert(19,5);
        lis.insert(55,8);
        lis.insertfirst(45);
        lis.insertlast(99);
        System.out.println("tail = "+lis.tall());

        lis.disp();
        lis.delete_last();
        lis.disp();
        lis.deleteFirst();
        lis.disp();
        lis.delete_at(3);
        lis.disp();
    }
}
