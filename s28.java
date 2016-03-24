class s28{
  public static void main(String args[]){
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    printPath(mat);
  }
  static void printPath(int[][] mat){
    printPath("", mat,mat.length,mat[0].length,0,0);
  }
  static void printPath(String path, int[][] mat, int r, int c, int i, int j){
    if(i>r-1 || j>c-1){
      return;
    }
    //we have reached at the bottom-right element
    String newPath = path+ mat[i][j] + "->";
    if((i==r-1) && (j==c-1)){
      System.out.println(newPath);
      return;
    }
    //right
    // if(i+1<r){
      printPath(newPath, mat,r,c,i+1,j);
    // }
    // //down
    // if(j+1<c){
      printPath(newPath, mat,r,c,i,j+1);
    // }
  }

}
