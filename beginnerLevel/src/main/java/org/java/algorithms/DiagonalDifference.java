package org.java.algorithms;

public class DiagonalDifference {
    /**
     * Given a square matrix, Calculate the absolute difference between the sums of it s diagonals
     * for example, the matrix arr is shown below:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * the-left-to-right-diagonal=1+5+9=15
     * the-right-to-left-diagonal=3+5+7=15
     * their absolute difference is |15-17|=2
     * */
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int ltr=0;
        int rtl=0;
        arr[0][0]=1;arr[0][1]=2;arr[0][2]=3;
        arr[1][0]=4;arr[1][1]=5;arr[1][2]=6;
        arr[2][0]=7;arr[2][1]=8;arr[2][2]=9;
        for(int i=0 ; i< arr.length ; i++){
            for (int j=0;j<arr[i].length;j++){
                if(i==j){
                    ltr+=arr[i][j];
                }
                if((i==0 && j>i) || (i==arr.length-1 && j==0)  ){
                        rtl+=arr[i][j];
                }

            }

        }
        System.out.println(rtl);
    }
}
