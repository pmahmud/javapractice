class MatrixStuff{
  void print(int[][] mat){
    int row = mat.length;
    int col = mat[0].length;
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");


  }
  void transpose(int[][] mat){
    int row = mat.length;
    int col = mat[0].length;
    for(int i = 0; i<row; i++){
      for(int j=i; j<col; j++){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
  }

  void swapRows(int[][] mat){
    int row = mat.length;
    for(int i = 0, j = row-1; i<j; i++,j--){
      int[] temp = mat[i];
      mat[i] = mat[j];
      mat[j] = temp;
    }
  }
  void rotateLeft(int[][] mat){
    this.transpose(mat);
    this.swapRows(mat);
  }
  void rotateRight(int[][] mat){
    this.swapRows(mat);
    this.transpose(mat);
  }

}
class s10{

  public static void main(String args[]){
    //int[][] matrix = new int[row][col];
    MatrixStuff mt = new MatrixStuff();
    int[][] mat = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};


    mt.print(mat);
    mt.transpose(mat);
    mt.print(mat);
    mt.transpose(mat);
    mt.print(mat);
    mt.swapRows(mat);
    mt.print(mat);
    mt.swapRows(mat);
    mt.print(mat);

    mt.rotateLeft(mat);
    mt.print(mat);
    mt.rotateRight(mat);
    mt.print(mat);



  }
}
