public class MatrixMultiplyNaive {
    Matrix multiplyNaive(Matrix A, Matrix B)
    {
        Matrix C = new Matrix();
        if(A.col != B.row)
        {
            System.out.println("Invalid size of input matrices.");
            return C;
        }
        C.row = A.row;
        C.col = B.col;
        C.data = new float[C.row*C.col];
        for(int i=0;i<A.row;i++)
        {
            for(int j=0;j<B.col;j++)
            {
                for(int k=0;k<A.col;k++)
                {
                    C.data[i*A.row + j] += A.data[i*A.row + k] * B.data[k*B.row + j];
                }
            }
        }

        return C;
    }
    
}

class Matrix
{
    int row;
    int col;
    float [] data;
}

