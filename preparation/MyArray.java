class MyArray {
    int[] arr;   
    int size;    


    public MyArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }


    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }
        arr[size] = value;
        size++;
    }


    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1]; // shift left
        }
        size--;
    }


    public int search(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        MyArray obj = new MyArray(5); 

        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50); 

        obj.traverse();   

        obj.delete(1);

        obj.traverse();   

        System.out.println(obj.search(30)); 
    }
}
