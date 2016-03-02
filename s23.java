import java.lang.Comparable;
class Node<T>{
  T data;
  Node<T> left;
  Node<T> right;
  Node(T data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class BST<T extends Comparable<T>>{
  Node<T> root;
  BST(){
    this.root = null;
  }

  public Node<T> getRoot(){
    return this.root;
  }

  public void insert(T data){
    this.root = this.insert(this.root, data);
  }
  private Node<T> insert(Node<T> root, T data){
    if(null==root){
      return new Node<T>(data);
    }
    if(data.compareTo(root.data)<0){
      root.left = insert(this.root.left, data);
    }else{
      root.right = insert(this.root.right, data);
    }
    return root;
  }

  public boolean isEmpty(){
    return null == this.root;
  }

  public void clear(){
    this.root = null;
  }
  public void inOrderPrint(){
    this.inOrderPrint(this.root);
  }
  private void inOrderPrint(Node<T> root){
    if(null==root){
      System.out.println("null");
      return;
    }
    inOrderPrint(root.left);
    System.out.println(root.data);
    inOrderPrint(root.right);
  }
  public void preOrderPrint(){
    this.preOrderPrint(this.root);
  }
  private void preOrderPrint(Node<T> root){
    if(null==root){
      System.out.println("null");
      return;
    }
    System.out.println(root.data);
    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }
  public void postOrderPrint(){
    this.preOrderPrint(this.root);
  }
  private void postOrderPrint(Node<T> root){
    if(null==root){
      System.out.println("null");
      return;
    }
    preOrderPrint(root.left);
    preOrderPrint(root.right);
    System.out.println(root.data);
  }
  public Node<T> find(T data){
    return this.find(this.root, data);
  }
  private Node<T> find(Node<T> root,T data){
    if(null==root || data.compareTo(root.data)==0){
      return root;
    }
    if(data.compareTo(root.data)<0){
      return find(root.left, data);
    }
    return find(root.right, data);
  }


}

class s23{
  public static void main(String args[]){
    BST<Integer> bst= new BST<Integer>();
    bst.insert(5);
    bst.insert(4);

    System.out.println("isEmpty:" + bst.isEmpty());
    bst.inOrderPrint();

  }
}
