
//This can be used for arraylist implementation
import java.lang.Object;
class Box<E>{
  private Object[] list = new Object[10];
  Box(E data){
    list[0] = data;
  }
  @SuppressWarnings("unchecked")
  public E getData(){
    return (E) list[0];
  }
}
class s9{
  public static void main(String args[]){
    Box<Integer> box = new Box<Integer>(12);
    System.out.println(box.getData());
  }
}
