import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String args[]) {
        File file_a = new File("./data/a_200.txt");
        File file_b = new File("./data/b_200.txt");
        
        try
        {
            long startTime=System.currentTimeMillis();
            Scanner scn_a = new Scanner(file_a);
            Scanner scn_b = new Scanner(file_b);
            MatrixIO io = new MatrixIO();
            MatrixMultiplyNaive mul = new MatrixMultiplyNaive();
            Matrix A = io.readMatrix(scn_a);
            Matrix B = io.readMatrix(scn_b);
            Matrix C = new Matrix();
            //io.printMatrix(A);
            //io.printMatrix(B);        
            for(int i=0;i<5000;i++)
            {C = mul.multiplyNaive(A, B);}
            io.printMatrix(C);
            long endTime=System.currentTimeMillis(); 
            System.out.println("running time is: "+(endTime-startTime)+"ms");
        }catch(Exception e){System.out.println("File not found error");}
            
        
    }
}