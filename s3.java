import java.util.ArrayList;

public class s3 {

  public static void main(String args[]){
    //merge two string array
    String[] words1 = {"hello","world"};
    String[] words2 = {"hi","class"};
    ArrayList<String> sentence = mergeTwoStrings(words1,words2);
    System.out.println(sentence.toString());
  }

  static ArrayList<String> mergeTwoStrings (String[] words1, String[] words2){
    ArrayList<String> result = new ArrayList<String>();
    for(String w: words1){
      result.add(w);
    }
    for(String w: words2){
      result.add(w);
    }
    return result;
  }


}
