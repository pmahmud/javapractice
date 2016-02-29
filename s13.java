import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;


class s13{
  public static void main(String args[]){
    Iterator<Integer> i;
    Set<Integer> set = new HashSet<Integer>();
    set.add(82);
    set.add(3);
    set.add(4);
    i = set.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    //set.clear();
    System.out.println(set.toString());
    set.add(78);
    set.add(3);
    set.add(1);
    set.add(0);

    System.out.println(set.toString());

    Set<Integer> sortedSet= new TreeSet<Integer>(set);
    System.out.println(sortedSet.toString());

  }
}
