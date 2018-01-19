package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int H = 5;
        int W = 5;
        String[][] declaredStringArray = new String [W] [H];
        int counter = 0;
        String addASpace;

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                counter++;
                if (counter < 10){
                    addASpace = " " + String.valueOf(counter);
                } else{
                    addASpace = String.valueOf(counter);
                }
                declaredStringArray[i][j] = addASpace;
                System.out.print(declaredStringArray [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
