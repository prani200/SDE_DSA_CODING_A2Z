/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) 
    {
        if(head == null || head.next == null || k==0) return head;
        int count = 1;
        Node tail = head;
        while(tail.next!=null)
        {
            count++;
            tail=tail.next;
        }
        
        if(k%count == 0) return head;
        
        k = k%count;
        tail.next=head;
        Node newLastNode = findNthNode(head,count-k);
        head=newLastNode.next;
        newLastNode.next=null;
        return head;

        
    }
    
    public static Node findNthNode(Node head,int k)
    {
        Node temp =head;
        while(k>1 && temp!=null)
        {
            temp=temp.next;
            k--;
        }
        
        return temp;
  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
