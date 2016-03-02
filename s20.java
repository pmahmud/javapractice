import java.util.Arrays;
class s20{
  public static void main(String args[]){
    int[] a = {3,364,42,8,1,2,6,7};

    System.out.println(Arrays.toString(a));
    insertionSort(a);
    System.out.println(Arrays.toString(a));
}
  //Time: O(n^2), Space: O(1)
  //i: 1 to length
  //val: a[i]
  //j: i-1 to a[j]>val
  //swap: a[j], a[j+1]
  static void insertionSort(int[] a){
    for(int i=1; i<a.length; i++){
      int val = a[i];
      for(int j=i-1; j>=0 && a[j]>val; j--){
        int temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
      }

    }
  }
}
