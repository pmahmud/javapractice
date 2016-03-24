//recursively find length of an array
class s25{
  public static void main(String args[]){
    int[] a = {1,2,3,4,5,6};
    printArrayRec(a,0,a.length-1);
  }
  static void printArrayRec(int[] arr, int low, int high){
    if(low>high){
      return;
    }
    int mid = low + ((high - low)/2);
    printArrayRec(arr,low, mid-1);
    System.out.println(arr[mid]);
    printArrayRec(arr,mid+1, high);
  }

}
