class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist{
    Node head = null;

    void insertbeginning(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertindex(int index, int data){
        if(index < 0){
            System.out.println("invalid input");
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void insertend(int data){
        if(head == null){
            insertbeginning(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void delete(int data){
        Node temp = head;
        if(head.data == data){
            head = head.next;
        }
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("invalid input");
            return;
        }
        temp.next =temp.next.next;
    }

    void deleteindex(int index){
        
        if(index < 0){
            System.out.println("invalid index");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0 ;  i < index-1 ;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
            System.out.println(true);
            return;
            }
            temp = temp.next;
        }
        System.out.println(false);
    }

    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertbeginning(10);
        list.insertbeginning(20);
        list.insertbeginning(30);

        list.insertend(40);
        
        list.insertindex(2, 15);

        list.delete(10);

        list.deleteindex(2);

        list.search(20);
        
        list.traverse();
    }

    
    

}
