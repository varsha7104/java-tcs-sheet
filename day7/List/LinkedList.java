import java.util.*;
class Node{
    int data;
Node next;
public Node(int data){
this.data=data;
this.next=null;
}


}
class LinkedList{
    public static Node insertatBeg(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
return newNode;
    }
    public static Node insertatEnd(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(head==null){
return newNode;
        }
        else {
            Node last= head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
            return last;
        }
        }
public static Node insertatPos(Node head,int pos,int data){
    if(pos<1){
        return head;
    } 
    if(pos==1){
        return insertatBeg(head, data);
    }
    Node curr=head;
    for(int i=1;i<pos-1 && curr!=null;i++){
curr=curr.next;

    }
    if(curr==null){
        return head;
    }
    else{
        Node newnode=new Node(data);
        newnode.next=curr.next;
        curr.next=newnode;
        return head;
    }
}

static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
public static void main(String[] args){



    // public static void main(String[] args) {
      
        // Create a linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = insertatEnd(head, 6);

        printList(head);
    // }

    }
}