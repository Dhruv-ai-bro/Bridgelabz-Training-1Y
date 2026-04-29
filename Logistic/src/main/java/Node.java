public class Node {
   int data;
   Node next;

   Node(int data){
       this.data = data;
   }

   public static void main(String[] args){
       Node n = new Node(40);
       Node n2 = new Node(50);
       Node n3 = new Node(60);

       n2.next = n3;
       n.next =  n2;

       System.out.println(n.data);
       System.out.println(n2.data);
       System.out.println(n3.data);

   }
}
