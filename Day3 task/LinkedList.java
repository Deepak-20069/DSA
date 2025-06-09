package sdprograms;

public class LinkedList {
	Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){this.data=data;}
    }
    void insert(int data,int position){
        Node newNode=new Node(data);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1&&temp!=null;i++)temp=temp.next;
        if(temp==null)return;
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void traverse(){
        Node temp=head;
        while(temp!=null){System.out.print(temp.data+" ");temp=temp.next;}
        System.out.println();
    }

}
