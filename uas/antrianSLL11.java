package uas;

public class antrianSLL11 {
    antrian11 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Belum ada antrian");
            System.out.println();
        } else {
             
        }
    }

    void addLast (int input) {
        antrian11 tambahan = new antrian11(input, null);
        if (isEmpty()) {
            head = tail = tambahan;
        } else {
            tail.next = head;
            head = tambahan;
        }
    }

    void removeLast(){

    }

    void removeFirst() {

    }
}
