public class Linlist {
    private Node head;
    private Node tail;
    private int size;

    public int tall(){
        return this.tail.val;
    }
    public Linlist(){
        size=0;
    }
    public void insertfirst(int val){
        Node node=new Node(val,null);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void deleteFirst(){
        head=head.next;
        size--;
    }
    public void delete_last(){
        Node ted=get(size-2);
        ted.next=null;
        tail=ted;
        size--;
    }
    public void delete_at(int index){
        Node tel=get(index-1);
        tel.next=tel.next.next;
        size--;
    }
    private Node get(int index){
        Node tem=head;
        for(int i=0;i<index;i++){
            tem=tem.next;
        }
        return tem;
    }
    public void insertlast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        if(head==null){
            head=tail;
        }
        size++;
    }
    public void insert(int val,int target){
        Node node=new Node(val);
        Node temp=head;
        while(temp.val!=target){
            temp=temp.next;
        }
            node.next=temp.next;
            temp.next=node;
        if(temp==tail){
        tail=node;
        }
        size++;

    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("end"+" size = "+size);
    }




//node class
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }
}
