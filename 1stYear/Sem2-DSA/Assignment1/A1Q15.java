/*
Problem Statement:
Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and column with the most 1s.
Sample run:
0 0 1 1 0 0 1 1 1 1 0 1 1 0 1 0
The largest row index: 2
The largest column index: 2
*/

public class A1Q15 {
    public static void main(String[] args) {
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                a[i][j]=(int)(Math.random()*2);
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        int mxrc=0,mxri=0,mxcc=0,mxci=0;
        for(int i=0;i<4;i++){
            int c=0;
            for(int j=0;j<4;j++){
                if(a[i][j]==1)
                    c++;
            }
            if(c>mxrc){
                mxrc=c;
                mxri=i;
            }
        }
        for(int j=0;j<4;j++){
            int c=0;
            for(int i=0;i<4;i++){
                if(a[i][j]==1)
                    c++;
            }
            if(c>mxcc){
                mxcc=c;
                mxri=j;
            }
        }
        System.out.println("The largest row index: "+mxri);
        System.out.println("The largest column index: "+mxci);
    }
}