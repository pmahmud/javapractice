class s29{
  public static void main(String args[]){
    System.out.println("hello world");
  }
  // pathCount(m, n, k):   Number of paths to reach mat[m][n] from mat[0][0]
  //                       with exactly k coins
  //
  // // Base cases
  //    if (m < 0 || n < 0) return 0;
  //    if (m==0 && n==0) return (k == mat[m][n]);
  //
  //    // (m, n) can be reached either through (m-1, n) or
  //    // through (m, n-1)
  //    return pathCountRec(mat, m-1, n, k-mat[m][n]) +
  //           pathCountRec(mat, m, n-1, k-mat[m][n]);


}
