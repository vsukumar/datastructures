package com.vijaysukumar.datastrcutures;

import java.util.Arrays;

public class MinimumDistance {

    public static void main(String[] args) {

        String firstString = "adceg";
        String secondString = "abcfg";
        int maxValue = getMinimumDistance(firstString, secondString);
        System.out.println(maxValue);
    }

    public static int getMinimumDistance(String firstString, String secondString) {
        int[][] matrix = new int[firstString.length() + 1][secondString.length() + 1];

        for (int i = 0; i < firstString.length() + 1; i++) {
            for (int j = 0; j < secondString.length() + 1; j++) {
                if (i == 0 & j == 0) {
                    matrix[i][j] = 0;
                } else if (i > 0 && j == 0) {
                    matrix[i][j] = matrix[i - 1][j] + 1;
                } else if (j > 0 && i == 0) {
                    matrix[i][j] = matrix[i][j - 1] + 1;
                } else {
                    if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                        matrix[i][j] = matrix[i - 1][j - 1];
                    } else {
                        matrix[i][j] = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i][j - 1], matrix[i - 1][j])) + 1;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        return matrix[firstString.length()][secondString.length()];
    }


//    String firstString = "adceg";
//    String secondString = "abcfg";
//    int[][] matrix = new int[firstString.length()+1][secondString.length()+1];
//
//        for(int i = 0; i< firstString.length()+1; i++){
//        for( int j = 0; j < secondString.length()+1; j++){
//            if( i ==0 & j==0 ) {
//                matrix[i][j]=0;
//            } else if (i >0 && j==0){
//                matrix[i][j] = matrix[i-1][j]+1;
//            } else if ( j >0 && i==0) {
//                matrix[i][j] = matrix[i][j-1] +1;
//            } else {
//                if( firstString.charAt(i-1) == secondString.charAt(j-1)) {
//                    matrix[i][j] = matrix[i-1][j-1];
//                } else {
//                    matrix[i][j] = Math.min( matrix[i-1][j-1] , Math.min(matrix[i-1][j-1], matrix[i-1][j]) ) +1 ;
//                }
//            }
//        }
//    }
//
//        System.out.println(Arrays.deepToString(matrix));
}
