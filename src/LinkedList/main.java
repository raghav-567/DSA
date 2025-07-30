package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(20);
        list.insertLast(10);
        list.insertLast(88);
        list.insertLast(91);
        list.display();
        System.out.println(list.deleteLast());
        list.display();


    }
}
