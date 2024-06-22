package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {

    Node head,tail;
    int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    private Node getNode(int idx){
        if(idx >= size)return null;
        Node curr = head;
        while(idx > 0){
            curr = curr.next;
            idx--;
        }
        return curr;
    }
    
    public int get(int index) {
        if(size==0 || index>=size)return -1;
        Node curr = getNode(index);
        return curr.data;

    }
    
    public void addAtHead(int val) {
        Node curr = new Node(val);
        if(size==0){
            head = curr;
            tail = curr;
            size++;
        }
        else{
            curr.next = head;
            head = curr;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        if(size==0){
            addAtHead(val);
            return;
        }
        Node curr = new Node(val);
        tail.next = curr;
        tail = tail.next;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)return;
        //at head
        if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node prevNode = getNode(index-1);
            Node newNode = new Node(val);

            Node curr = prevNode.next;
            prevNode.next = newNode;
            newNode.next = curr;
            size++; 
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)return;
        if(index == 0){
            head = head.next;
            size--;
        }

        else if(index == size-1){
            Node curr = getNode(index-1);
            tail = curr;
            tail.next = null;
            size--;
        }
        else{
            Node curr = getNode(index-1);
            curr.next = curr.next.next;
            size--;
        }

    }
}


public class Design_Linked_List{
    public static void main(String[] args) {
        // Node l1 = new Node(5);
        // Node l2 = new Node(6);
        // Node l3 = new Node(7);
        // Node l4 = new Node(8);
        // Node l5 = new Node(9);
        // l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;
        // l4.next = l5;



        // Your MyLinkedList object will be instantiated and called as such:
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(5);
        obj.addAtTail(4);
        obj.addAtIndex(2,9);
        obj.deleteAtIndex(2);
        int param_1 = obj.get(2);
        System.out.println(param_1);
    }
}