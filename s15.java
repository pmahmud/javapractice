class Box<T>{
  T data;
  Box(T data){
    this.data = data;
  }
  void print(){
    System.out.println(data);
  }
}
class s15{
  public static void main(String args[]){
    Box<Integer> box = new Box<Integer>(45);
    box.print();

  }
}
