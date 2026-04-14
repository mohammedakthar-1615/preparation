class doubleLinkedlist{
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;

    void insertbeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
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
        if (temp == null) return;

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
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
        newnode.prev = temp;
    }

    void delete(int data){
        Node temp = head;
        if(head.data == data){
            head = head.next;
        }
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next; // deleting head
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    void deleteindex(int index){
        
        if (index < 0 || head == null){
            return;
        } 

        Node temp = head;

        for (int i = 0; temp != null && i < index; i++) {
            temp = temp.next;
        }

        if (temp == null){
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next; // deleting head
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
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
        doubleLinkedlist list = new doubleLinkedlist();
        list.insertbeginning(50);
        list.insertbeginning(60);
        list.insertbeginning(70);

        list.insertend(80);
        
        list.insertindex(2, 65);

        list.delete(500);

        list.deleteindex(2);

        list.search(60);

        
        list.traverse();
    }
}