import java.util.ArrayList;
class s6{
  public static void main(String args[]){

    ArrayList<Integer> al = new ArrayList<Integer>();
    //add item to the list
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(4);

    //print the arraylist
    System.out.print("list content:\n"+al+"\n");

    System.out.println("Contains 3:"+ al.contains(3));
    System.out.println("Contains 11:"+al.contains(11));
    System.out.println("first index of 4:"+al.indexOf(4));
    System.out.println("last index of 4:"+al.lastIndexOf(4));
    System.out.println("index of 11:"+ al.indexOf(11));

    //remove the last 4
    //remove by index
    System.out.println("removing last 4");
    al.remove(al.lastIndexOf(4));

    //get size
    System.out.println("size:"+al.size());

    // get by Index
    System.out.println("item at index 0:"+al.get(0));

    //traverse each item
    System.out.println("printing the list one by one");
    for(int x:al){
      System.out.println(x);
    }

  }
}
