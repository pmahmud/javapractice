import java.lang.RuntimeException;
class Queue<T>{
  private static class Node<T>{
    private T data;
    private Node<T> next;
    public Node(T data){
      this.next = null;
      this.data = data;
    }
  }
  private Node<T> first;
  private Node<T> last;
  public Queue(){
    this.first = null;
    this.last = null;
  }
  public void add(T data){
    Node<T> n = new Node<T>(data);
    if(null!=last){
      last.next = n;
    }
    last = n;
    if(null==first){
      first = last;
    }
  }

  public T remove(){
    if(null==first){
      throw new RuntimeException();
    }
    T data = first.data;
    first = first.next;
    if(null==first){
      last = null;
    }
    return data;
  }
  public T peek(){
    if(null==first){
      throw new RuntimeException();
    }
    return first.data;
  }

  public boolean isEmpty(){
    return null == first;
  }
}
class s17{
  public static void main(String args[]){
    Queue<Integer> q = new Queue<Integer>();
    q.add(2);
    q.add(3);

    System.out.println(q.peek());
    q.remove();
    System.out.println(q.peek());
    q.remove();
    System.out.println("isEmpty: " + q.isEmpty());
  }
}
