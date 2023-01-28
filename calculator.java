import java.util.*;
import java.util.Scanner;

class Transpose_matrix{

public static void main(String args[])
{

Scanner in = new Scanner(System.in);
System.out.println("Enter Rows And Columns:");
int rows =  in.nextInt();
int cols = in.nextInt();
int mat[][] = new int[rows][cols];
int i,j;

System.out.println("Enter Matrix:");
for(i=0;i<rows;i++)
{
     for( j =0;j<cols;j++)
   {
       mat[i][j] = in.nextInt();

    }
}

System.out.println("Initial Matrix: ");
for( i=0;i<rows;i++)
{

    for( j=0;j<cols;j++)
  {
       System.out.print(mat[i][j]+ " ");

   }
    System.out.println();
}

System.out.println("Transpose Matrix: ");


for( i=0;i<cols;i++)
{

     for( j=0;j<rows;j++)
   {
      System.out.print(mat[j][i]+ " ");

    }
   System.out.println(" ");
}

  }

}


