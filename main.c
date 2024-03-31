#include<stdio.h>
#include"./include/matrix.h"
#include"./include/multiply.h"
#include<time.h>
#include<math.h>

void print_matrix(struct Matrix mat)
{
    for(int i=0;i<mat.row;i++)
    {
        for(int j=0;j<mat.col;j++)
        {
            printf("%.2f ",mat.data[i*mat.row + j]);
        }
        printf("\n");
    }
    printf("\n");
}

struct Matrix read_matrix(struct Matrix mat)
{
    printf("the size of the matrix is:\n");
    scanf("%d %d",&mat.row,&mat.col);
    printf("please insert the elements of the matrix:\n");
    printf("%d %d \n",mat.row,mat.col);
    
    for(int i=0;i<mat.row;i++)
        for(int j=0;j<mat.col;j++)
        {
            scanf("%f",&mat.data[i*mat.row + j]);
        }
    return mat;
    
}

struct Matrix read_matrix_from_file(struct Matrix  mat, const char* dir)
{
    FILE * file = NULL;
    file = fopen(dir, "r");
    fscanf(file,"%d",&mat.row);
    fscanf(file,"%d",&mat.col);
       
    for(int i=0;i<mat.row;i++)
    {
        for(int j=0;j<mat.col;j++)
        {          
            fscanf(file,"%f",&mat.data[i*mat.row+j]);
            // mat.data[i*mat.row+j] = (int)(mat.data[i*mat.row+j]*1000);
            // mat.data[i*mat.row+j] = mat.data[i*mat.row+j]/1000;
        }
    }
    

    fclose(file);
    return mat;
}

int main()
{   
    clock_t start,end;
    start = clock();
    struct Matrix A,B,C;
    //A = read_matrix(A);
    //B = read_matrix(B);
    //printf("input is:\n");
    A = read_matrix_from_file(A,"./data/a_200.txt");
    //print_matrix(A);
    B = read_matrix_from_file(B,"./data/b_200.txt");
    //print_matrix(B);
    for(int i =0;i<5000;i++)
    {
        C = naive_multiply(A, B);
        //printf("The result is:\n");      
        
    }
    print_matrix(C);
    end = clock();
    //printf("running time is %ld s\n",(end-start)/CLOCKS_PER_SEC);
}
