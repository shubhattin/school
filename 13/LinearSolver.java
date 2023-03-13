public class LinearSolver {
  public static void main(String[] args) {
    LinearSolver a = new LinearSolver();
    // Example :- `AX = B`
    double[][] A = {
        { 6, 3, 2 },
        { 6, 4, 3 },
        { 20, 15, 12 }
    };
    double[] B = {
        1, 0, 0
    };
    // Output: `X`
    double X[] = a.solve_linear(A, B);
    for (int x = 0; x < X.length; x++)
      System.out.printf("X[%d] = %f\n", x + 1, X[x]);
  }

  double[] solve_linear(double[][] A, double[] B) {
    int len = A.length;
    double X[] = new double[len];
    double delta = determinant(A);
    for (int x = 0; x < len; x++) {
      double[][] arr = cloneMatrix(A);
      for (int i = 0; i < len; i++)
        arr[i][x] = B[i];
      double delta_i = determinant(arr);
      X[x] = delta_i / delta;
    }
    return X;
  }

  double determinant(double[][] A_orig) {
    double[][] A = cloneMatrix(A_orig);
    int len = A.length;
    for (int i = 0; i < len; i++)
      for (int j = 0; j < i; j++) {
        double r = A[i][j] / A[j][j];
        // itertating over lower elements of upper triangular matrix
        for (int x = 0; x < len; x++)
          A[i][x] = A[i][x] - r * A[j][x];
      }
    double det = 1;
    for (int i = 0; i < len; i++)
      det *= A[i][i];
    if (det == -0)
      return 0;
    return det;
  }

  double[][] cloneMatrix(double[][] A) {
    int len = A.length;
    double[][] B = new double[len][len];
    for (int i = 0; i < len; i++)
      for (int j = 0; j < len; j++)
        B[i][j] = A[i][j];
    return B;
  }
}
