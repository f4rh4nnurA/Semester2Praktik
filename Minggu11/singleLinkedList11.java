package Minggu11;

public class singleLinkedList11 {
    node11 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            node11 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print("\t" + tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int input) {
        node11 ndInput = new node11(input, head);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        node11 ndInput = new node11(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node11 ndInput = new node11(input, null);
        node11 temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key tidak ditemukan!");
            return;
        }
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Perbaiki Logikanya! Indeks Tidak Boelh Negatif. ");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        } else {
            node11 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new node11(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }  
    }    
    
    int getData(int index){
        node11 tmp = head;
        for (int i = 0; i < index + 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf (int key){
        node11 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst(){
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else if (head != tail){
            head = tail = null;
        } else {
            node11 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove (int key) {
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else {
            node11 temp = head;
            while (temp != null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node11 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
