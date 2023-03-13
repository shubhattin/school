public class Inverse {
    public static void main(String[] args) {
        Inverse a = new Inverse();
        double[][] arr = {
                { -1, 1, 2 },
                { 1, 2, 3 },
                { 3, 1, 1 }
        };
        double[][] inv = a.inverse(arr);
        System.out.println("Inverse Matrix:");
        a.print_matrix(inv);
    }

    double[][] inverse(double[][] A) {
        int len = A.length;
        double delta = determinant(A);
        if (delta == 0) {
            System.out.println("Inverse Matrix Not Possible");
            System.exit(-1);
        }
        double[][] I = adjoint(A);
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                I[i][j] /= delta;
        return I;
    }

    double[][] adjoint(double[][] A) {
        int len = A.length;
        double[][] ADJ = new double[len][len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++) {
                double[][] minor_matrix = filter_row_column(A, i, j);
                double cofactor = Math.pow(-1, i + j) * determinant(minor_matrix);
                ADJ[i][j] = cofactor;
            }
        ADJ = transpose_matrix(ADJ);
        return ADJ;
    }

    double[][] filter_row_column(double[][] A, int row, int column) {
        int len = A.length - 1;
        double[][] B = new double[len][len];
        int x = 0, y = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == row)
                continue;
            y = 0;
            for (int j = 0; j < A.length; j++) {
                if (j == column)
                    continue;
                B[x][y] = A[i][j];
                y++;
            }
            x++;
        }
        return B;
    }

    double[][] transpose_matrix(double[][] A) {
        int len = A.length;
        double[][] B = new double[len][len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                B[i][j] = A[j][i];
        return B;
    }

    double determinant(double[][] A_orig) {
        double[][] A = cloneMatrix(A_orig);
        int len = A.length;
        for (int i = 0; i < len; i++)
            for (int j = 0; j < i; j++) {
                double r = A[i][j] / A[j][j];
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

    void print_matrix(double[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++)
                System.out.printf("%.3f\t", A[i][j]);
            System.out.println();
        }
    }
}
