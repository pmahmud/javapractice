import java.lang.RuntimeException;
class Stack<T>{
  private static class Node<T>{
    private T data;
    private Node<T> next;
    public Node(T data){
      this.next = null;
      this.data = data;
    }
  }

  private Node<T> top;
  public Stack(){
    top = null;
  }
  public boolean isEmpty(){
    return top==null;
  }
  public void push(T data){
    Node<T> n = new Node<T>(data);
    n.next = top;
    top = n;
  }
  public T peek(){
    if(null==top){
      throw new RuntimeException();
    }
    return top.data;
  }

  public T pop(){
    if(null==top){
      throw new RuntimeException();
    }
    T data = top.data;
    top = top.next;
    return data;
  }
}

public class s16{
  public static void main(String args[]){
    Stack<Integer> stack = new Stack<Integer>();
    //System.out.println(stack.pop());
    stack.push(1);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    while(!stack.isEmpty()){
      System.out.println(stack.pop());
    }
    stack.push(1);
    System.out.println(stack.peek());
    System.out.println("isEmpty: "+stack.isEmpty());

  }
}
