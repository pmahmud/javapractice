class s26{
  public static void main(String args[]){
    int[][] mat = {{1,2,3},{4,5,6}};
    System.out.println(getPathCount(mat));
  }
  static int getPathCount(int[][] mat){
    return getPathCount(mat,0,0);
  }
  static int getPathCount(int[][] mat, int i, int j){

    if((i==mat.length-1) || (j==mat[0].length-1)){
      return 1;
    }
    return getPathCount(mat,i,j+1) + getPathCount(mat,i+1,j);
  }

}
