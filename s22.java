import java.util.Arrays;
class s22{
  public static void main(String args[]){
    int[] a = {1,2,3,4};

    System.out.println(Arrays.toString(a));
    System.out.println(binSearchRec(a,0,a.length-1,4));
}
  //Runtime: O(log n), Space: O(log n)
  static int binSearchRec(int[] a, int low, int high, int key){
    if(low>high) return -1;
    int mid = low + ((high - low)/2);
    if(key==a[mid]){
      return mid;
    }else if(key>a[mid]){
      return binSearchRec(a,mid+1, high, key);
    }else{
      return binSearchRec(a,low, mid-1, key);
    }
  }

}
