public class MylinkedList {
   private Node head;
   private int numNodes = 0;
   public MylinkedList(Object data){
       head = new  Node(data);
   }
   public class Node{
       private Node next;
       private Object data;
       public Node(Object data){
           this.data = data;
       }
       public Object getData(){
           return this.data;
       }
   }
   public void addIndex(int index,Object data){
       Node temp = head;
       Node holder;
       for (int i = 0; i < index - 1 && temp.next != null; i++) {
           temp = temp.next;
       }
       holder = temp.next;
       temp.next = new Node(data);
       temp.next.next = holder;
numNodes++;
   }
   public void addFirst(Object data){
Node temp = head;
head = new Node(data);
head.next = temp;
numNodes++;
   }
   public void addLast(Object data){
       Node temp = head;
       Node newNode = new Node(data);
       while (temp.next!=null){
           temp = temp.next;
       }
       temp.next = newNode;
       numNodes++;
   }
   public Node getIndex(int index){
       Node temp = head;
       for (int i = 0; i < index; i++) {
         temp = temp.next;
       }
       return temp;
   }
   public void printlist(int i){
       Node temp = head;
       int index = 0;
       while (temp != null){
           if (index == i){
               System.out.println(temp.data);
           }
          index++;
           temp = temp.next;
       }
   }
   public Node remove(int index){
       Node temp = head;
       for (int i = 0; i < index; i++) {
           temp = temp.next;
       }
       Node current = temp.next;
       temp.next = current.next;
       numNodes--;
       return current;
   }
   public Node remove(Object data){
       Node temp = head;
       while (temp != data){
           temp = temp.next;
       }
       Node current = temp.next;
       temp.next = current.next;
       numNodes--;
       return current;
   }
   public int size(){
       int count = 0;
       Node temp = head;
       while (temp!=null){
           temp = temp.next;
           count++;
       }
       return count;
   }
   public boolean container(Object data){
       boolean check = false;
       Node temp = head;
       while (temp!=null){
           temp = temp.next;
           if (temp == data){
               check = true;
           }
       }
       return check;
   }
   public int indexOf(Object data){
       int index = -1;
       Node temp = head;
       if (container(data)){
           while (temp!=null){
               temp = temp.next;
               index++;
               if (temp == data){
                   break;
               }
           }
       }
       return index;

   }
}
