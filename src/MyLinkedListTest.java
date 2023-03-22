public class MyLinkedListTest {
    public static void main(String[] args) {
MylinkedList myList = new MylinkedList(1);
myList.addFirst(2);
myList.addLast(3);
myList.remove(2);
        System.out.println(myList.container(1));
        myList.printlist(0);
        myList.printlist(1);
//        myList.printlist(2);
    }
}
