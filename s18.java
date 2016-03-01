import java.lang.Exception;
import java.lang.reflect.Array;
class Stack<T>{
  private int stackSize;
  private int size;
  private T[] store;

  public Stack(){
    this(100);
  }

  public Stack(int stackSize){
    this.stackSize = stackSize;
    Class <T> c;

    @SuppressWarnings("unchecked")
    final T[] a = (T[]) Array.newInstance(c, stackSize);
    this.store = a;
    //this.store = (T[]) Array.newInstance(class <T>,stackSize);
    this.size = 0;
  }


  public boolean isEmpty(){
    return this.size==0;
  }

}
class s18{
  public static void main(String args[]){
    Stack<Integer> stack = new Stack<Integer>();

    System.out.println("isEmpty:" + stack.isEmpty());
  }
}
