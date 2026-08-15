// You are using Java
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        left=null;
        right=null;
        this.data=data;
    }
}
class bst{
    Node root=null;
    Node insert(int d,Node temp){
        if(temp==null){
            return new Node(d);
        }
        else if(d>temp.data){
            temp.right=insert(d,temp.right);
        }
        else if(d<temp.data) temp.left=insert(d,temp.left);
        return temp;
    }
    void preorder(Node temp){
        if(temp==null) return;
        System.out.print(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }
}
public class tree{
    public static void main(String[] args){
        bst b1=new bst();
        b1.root= b1.insert(5,b1.root);
        b1.insert(6,b1.root);
        b1.insert(8,b1.root);
        b1.insert(52,b1.root);
        b1.insert(9,b1.root);
        b1.insert(94,b1.root);
        b1.preorder(b1.root);
    }
}
