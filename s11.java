//Runtime: O(log n), Space: O(1) 

class BinarySearch{
  int search(int[] a, int key){
    int low = 0;
    int high = a.length -1;
    while(low<=high){

      int mid = low + (high-low)/2;
      if(a[mid]==key){
        return mid;
      }else if(key<a[mid]){
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return -1;
  }
}
class s11{
  public static void main(String args[]){
    BinarySearch bn = new BinarySearch();
    int[] a = {1,2,3,4,5,6};
    System.out.println("Found at index:" + bn.search(a,4));
  }
}
