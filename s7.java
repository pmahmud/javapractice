import java.util.ArrayList;

class StringStuff{
  ArrayList<String> mergerStringArrays(String stringArray1[], String stringArray2[]){
    ArrayList<String> al = new ArrayList<String>();
    for(String s: stringArray1){
      al.add(s);
    }
    for(String s: stringArray2){
      al.add(s);
    }
    return al;
  }

  String makeAsentence(String[]words){
    StringBuilder sb = new StringBuilder();
    for(String word:words){
      sb.append(" " + word);
    }
    return sb.toString();
  }

  boolean isUnique(String s){
    //consider extended ascii
    if(s.length()>256){
      return false;
    }
    boolean[] charBools = new boolean[256];
    for(char c: s.toCharArray()){
      if(charBools[c]){
        return false;
      }
      charBools[c] = true;
    }
    return true;
  }


}
class s7{
  public static void main(String args[]){
    StringStuff s = new StringStuff();

    String[] s1 = {"Hello", "World"};
    String[] s2 = {"Bye", "World"};

    ArrayList al = s.mergerStringArrays(s1, s2);
    System.out.println(al);
    System.out.println(s.makeAsentence(s1));
    System.out.println("isUnique:" + s.isUnique("healoso"));
  }
}
