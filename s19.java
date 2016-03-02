import java.util.Arrays;
class s19{
  public static void main(String args[]){
    int[] a = {3,364,42,8,1,2,6,7};

    System.out.println(Arrays.toString(a));
    bubbleSort(a);
    System.out.println(Arrays.toString(a));
    for(int i=0; i<a.length-1; i++){
      System.out.print(a[i] + " ");
    }
}
  //Time: O(n^2), Space: O(1)
  // i = 0 to length - 1
  // j = 1 to length - i
  // compare and swap: a[j], a[j-1]
  static void bubbleSort(int[] a){
    for(int i = 0; i < a.length-1; i++){
      //invariant: after one pass the last element is in the correct place
      for(int j = 1; j < a.length-i; j++){
        if(a[j-1]>a[j]){
          int temp = a[j-1];
          a[j-1] = a[j];
          a[j] = temp;
        }
      }
    }
  }
}
