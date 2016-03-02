import java.util.Arrays;
class s21{
  public static void main(String args[]){
    int[] a = {3,364,42,8,1,2,6,7};

    System.out.println(Arrays.toString(a));
    selectionSort(a);
    System.out.println(Arrays.toString(a));
}
  /*Time: O(n^2), Space: O(1)
    i: 0 to length-1
    minIndex = i
    j: i+1 to length
    swap: a[minIndex] and a[i]
  */
  static void selectionSort(int[] a){
    for(int i=0; i<a.length-1; i++){
      int minIndex = i;
      for(int j=i+1; j<a.length; j++){
        if(a[j]<a[minIndex]){
          minIndex = j;
        }
      }
      int temp = a[minIndex];
      a[minIndex] = a[i];
      a[i] = temp;
    }

  }
}
