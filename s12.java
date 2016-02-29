import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

class s12{
  public static void main(String args[]){
    HashMap<String,Integer> hm = new HashMap<String, Integer>();
    hm.put("Sarah", 19);
    hm.put("Dan", 29);

    Set s = hm.entrySet();
    Iterator iter = s.iterator();
    while(iter.hasNext()){
      Map.Entry me= (Map.Entry) iter.next();
      System.out.println(me.getKey()+"-" + me.getValue());
    }

  }
}
