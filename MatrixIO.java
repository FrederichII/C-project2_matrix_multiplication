import java.util.Scanner;

public  class MatrixIO {
    public void printMatrix(Matrix mat)
    {
        for(int i=0;i<mat.row;i++)
        {
            for(int j=0;j<mat.col;j++)
            {
                System.out.printf("%.2f ",mat.data[i*mat.row + j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix readMatrix(Scanner scn)
    {
        System.out.println("size of the matrix is: ");
        int m = scn.nextInt();
        int n = scn.nextInt();
        Matrix mat = new Matrix();
        mat.row = m;
        mat.col = n;
        mat.data = new float[m*n];
        if(m<=0||n<=0)
        {
            System.out.println("size must be greater than zero.");
            return mat;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat.data[i*mat.row + j] = scn.nextFloat();
            }
        }
        return mat;
    }

}

