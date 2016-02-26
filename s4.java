//ArrayList implementataion
//http://www.java2novice.com/java-interview-programs/arraylist-implementation/
import java.util.Arrays;
public class s4 {
  public static void main(String args[]){

  }
}

public class MyArrayList{
  private Object[] listOfObjects;
  private size = 0;
  public MyArrayList(){
    listOfObjects = new Object[10];
  }
  public int size(){
    return size;
  }
  private getMoreSpace(){
    listOfObjects = Arrays.copyOf(listOfObjects, listOfObjects.length *2);
    System.out.println("New length: " + listOfObjects.length);
  }
}
