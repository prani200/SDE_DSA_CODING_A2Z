/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) 
    {
        if(head ==null) return null;
        
        Node prev = null;
        Node curr = head;
        
        while(curr!=null)
        {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

        }
    
    
      return prev;        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
