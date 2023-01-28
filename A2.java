// import java.util.*;
public class A2 {
    public static void main(String[] args) {
        int[][]  arr1= {{1,2,3},{4,5,6},{7,8,9}};
        int sumRow,sumColumn,sumElement = 0;

        for(int i = 0; i<arr1.length;i++)
        {
            sumRow = 0;
            sumColumn = 0;
            for(int j = 0; j<arr1[i].length;j++)
            {
                sumRow = sumRow + arr1[i][j];
                sumColumn = sumColumn +arr1[i][j];
                sumElement = sumElement + arr1[i][j];
            }
            // System.out.println("Sum of " +(i+1) + "  row =     " +sumRow);
            // System.out.println("Sum of " +(i+1) + "  columns = " +sumColumn);

        }
      
        System.out.println("Sum of Elements =   " +sumElement);
    }
    
}
