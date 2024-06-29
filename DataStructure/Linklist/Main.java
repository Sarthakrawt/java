package Linklist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(32);
        list.insertFirst(23);
        list.insert(44, 1);
        list.printLL();
    }
}
