/*Linked List
  - constant time insertion(at head)
  - searching, removal is costly (linear time)
  - random access is not possible
*/

import java.util.Stack;
class Node{
  Node next;
  int data;

  Node(int data){
    this(null, data);
  }

  Node(Node next, int data){
    this.next = next;
    this.data = data;
  }

}

class SinglyLinkedList{
  Node head;

  SinglyLinkedList(){
    head = null;
  }

  SinglyLinkedList(Node head){
    this.head = head;
  }

  Node getHead(){
    return head;
  }

  void setHead(Node n){
    this.head = n;
  }
  void clear(){
    this.setHead(null);
  }
  void insert(int d){
    Node n = new Node(d);
    if(head==null){
      head = n;
    }else{
      n.next = head;
      head = n;
    }
  }

  void printLists(){
    Node n = this.head;
    while(n!=null){
      System.out.print(n.data);
      System.out.print("-->");
      n = n.next;
    }
    System.out.print("null\n");
  }

  boolean find(int data){
    Node n = this.head;
    while(n!=null){
      if(n.data == data){
        return true;
      }
      n = n.next;
    }
    return false;
  }

  int getMidPoint(){
    Node n1 = head;
    Node n2 = head;
    int result = -1;
    while(n1!=null){
      n1 = n1.next;
      if(n1!=null){
        n1 = n1.next;
        n2 = n2.next;
      }
    }
    if(n2!=null){
      result = n2.data;
    }
    return result;
  }

  void reverse(){
    Node prev = null;
    Node current = this.head;
    Node next = null;

    while(null!=current){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    this.head = prev;
  }

  int getKthFromLast(int k){
    Node runner = head;
    Node lagger = head;
    int result = -1;
    //give runner the advantage to run ahead this will create K difference
    while(0!=k && null!=runner){
      runner = runner.next;
      k--;
    }

    while( null!=runner){
      runner = runner.next;
      lagger = lagger.next;
    }

    if( null!=lagger ){
      result = lagger.data;
    }
    return result;
  }
  boolean isPalindrome(){
    Stack<Node> nodeStack = new Stack<Node>();
    Node n = head;

    if(null == n){
      return false;
    }
    while(null!=n){
        nodeStack.push(n);
        n = n.next;
    }

    //reset the head here
    n = head;
    while(!nodeStack.empty()){
      if(nodeStack.peek().data != n.data){
        return false;
      }
      nodeStack.pop();
      n = n.next;
    }
    return true;
  }
  void remove(int data){
    /* Cases to consider here
     1. list is empty
     2. matches with head
     3. match found in the middle
    */
    Node n = head;

    //if the list is empty
    if(n==null){
      return;
    }

    //matches with head
    if(n.data == data){
      head = n.next;
      return;
    }

    //matches with a node in the middle
    while(n.next!=null){
      if(n.next.data == data){
        n.next = n.next.next;
        return;
      }
      n = n.next;
    }

  }


}


class s5{
  public static void main(String args[]){
    SinglyLinkedList sl = new SinglyLinkedList();
    //trying to remove from an empty list
    sl.remove(1);

    sl.insert(1);
    //trying to remove with one item
    sl.printLists();

    sl.remove(1);
    sl.printLists();

    sl.insert(1);
    sl.insert(2);
    sl.insert(3);
    sl.insert(4);

    //trying to remove head
    sl.remove(4);
    sl.printLists();

    //make the list again
    sl.insert(4);
    sl.printLists();

    sl.remove(2);
    sl.printLists();


    boolean isFound = false;
    isFound = sl.find(3);
    if(isFound){
      System.out.println("3 is found");
    }else{
      System.out.println("3 not found");
    }

    isFound = sl.find(7);
    if(isFound){
      System.out.println("7 is found");
    }else{
      System.out.println("7 not found");
    }

    //They have different address so they are obviously not same
    Node n1 = new Node(2);
    Node n2 = new Node(2);
    System.out.println(n1==n2);


    sl.insert(5);
    sl.printLists();
    System.out.println("Mid:" + sl.getMidPoint());
    sl.insert(6);
    sl.printLists();
    System.out.println("Mid:" + sl.getMidPoint());
    sl.clear();
    System.out.println("Mid:" + sl.getMidPoint());

    sl.insert(5);
    sl.printLists();

    System.out.println("Mid:" + sl.getMidPoint());

    sl.clear();
    sl.insert(1);
    sl.insert(2);
    sl.insert(3);
    sl.insert(4);
    sl.insert(5);
    sl.printLists();

    System.out.println("2nd last:" + sl.getKthFromLast(2));
    sl.reverse();
    sl.printLists();

    sl.clear();
    sl.insert(1);
    sl.insert(2);
    sl.insert(2);
    sl.insert(1);

    sl.printLists();
    System.out.println("isPalindrome:" + sl.isPalindrome());

  }

}
