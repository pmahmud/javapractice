//Sandbox - used for misc testing
import java.util.Arrays;
class s9{
  static void transpose(int[][] m) {

          for (int i = 0; i < m.length; i++) {
              for (int j = i; j < m[0].length; j++) {
                  int x = m[i][j];
                  m[i][j] = m[j][i];
                  m[j][i] = x;
              }
          }
  }

  public static void main(String args[]){
    String s1 = "hello world";
    String s2 = "vo";
    int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
    transpose(m);
    System.out.print(Arrays.deepToString(m));

    //System.out.println(s1.indexOf("he"));

  }
}
