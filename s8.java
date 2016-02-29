import java.util.Hashtable;
import java.util.Enumeration;
class s8{
  public static void main(String args[]){
    //optional: size, fillratio (0.75 by default)
    Hashtable<String,Integer> ht = new Hashtable<String,Integer>();

    ht.put("Jack", 19);
    ht.put("Jone", 20);

    System.out.println("Jack's age is:"+ ht.get("Jack"));
    System.out.println("Jim's age is:"+ ht.get("Jim"));

    //similarly ht.elements();
    Enumeration keys = ht.keys();

    //print all the stuff in the table
    while(keys.hasMoreElements()){
      String currentKey = (String)keys.nextElement();
      int currentValue = (Integer)ht.get(currentKey);
      System.out.println(currentKey+"-->" + currentValue);
    }
    System.out.println("Size: "+ ht.size());
    //ht.toString()

    ht.clear();
    System.out.println("isEmpty:"+ht.isEmpty());
    ht.put("Jack", 19);
    ht.put("Jone", 50);
    ht.put("Jim", 49);
    ht.put("Jane", 50);
    ht.put("Josh", 69);
    ht.put("Judy", 70);
    System.out.println("Contents:"+ht.toString());

    System.out.println("Contains Jane key:" +ht.containsKey("Jane") );
    //contains and containsValue is essentially the same method
    System.out.println("Contains value:" +ht.containsValue(50) );
    System.out.println("Contains Jacky key:" +ht.containsKey("Jacky") );


  }
}
