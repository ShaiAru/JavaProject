package arrays;

import java.util.Scanner;

public class CrossHomework {
    //1. tick tack toe
    //first user is going to play X.
    //second user is going to play O
    //you are going to ask a user X or O to enter cell number(coloumn, row)
    //once the user X or O enters the coloumn you need to print out a table with the X or O filled.
    //1. Enter X -> 2,0
    //2. Enter O -> 1,1
    //3. Enter X -> 0,2
    //   Enter O -> 0,1
    //   Enter X -> 2,2
    //   Enter O -> 2,1
    //   Enter X -> 1,2
    //you write a logic which will say X or O won.
    //if no one won draw.
    //       0     1     2
    /// --------------------
    /// 0  |   |    |  X   |
    //   --------------------
    /// 1 | O  |  O  |  O  |
    //---------------------
    /// 2 | X  |  X  |  X  |
    ///----------------------

    public static boolean checkWin(char[][] grid){
        for (int i=0; i<3;i++){//for rows
            if(grid[i][0]==grid[i][1] && grid[i][1]==grid[i][2]){
                if(grid[i][0]== 'x'){
                    System.out.println("Player X wins!");
                    return true;
                }
                else if  (grid[i][0] =='o'){
                    System.out.println("Player O wins!");
                    return true;

                }
            }
        }
        for (int i=0; i<3;i++){//for columns
            if(grid[0][i]==grid[1][i] && grid[1][i]==grid[2][i]){
                if(grid[0][i]== 'x'){
                    System.out.println("Player X wins!");
                    return true;
                }
                else if (grid[0][i] =='o'){
                    System.out.println("Player O wins!");
                    return true;
                }
            }
        }
        if(grid[0][0]==grid[1][1]&&grid[1][1]==grid[2][2]){
            if(grid[0][0]== 'x'){
                System.out.println("Player X wins!");
                return true;
            }
            else if(grid[0][0]=='o'){
                System.out.println("Player O wins!");
                return true;
            }
        }

        if(grid[0][2]==grid[1][1]&&grid[1][1]==grid[2][0]){
            if(grid[0][2]== 'x'){
                System.out.println("Player X wins!");
                return true;
            }
            else if (grid[0][2]== 'o'){
                System.out.println("Player O wins!");
                return true;
            }

        }  return false;

    }

    public static boolean gameOver(char[][] grid){
        boolean won = checkWin(grid);
        if(won){
            return true;
        }
        for(int i=0; i<3; i++){
            for(int j = 0; j<3;j++){
                if(grid[i][j]!='x'&&grid[i][j]!='o'){
                    return false;
                }
            }
        } return true;
    }

    public static void printGrid(char[][] grid){

        System.out.println("  0    1    2  ");
        System.out.println("--------------");
        for(int i=0; i<3; i++){
            System.out.print((i) + " |");
            for(int j = 0; j<3;j++){
                System.out.print(" " + grid[i][j]+ " |");
            }
            System.out.println();
            System.out.println("--------------");
        }

    }


    //  2.//write a method which find the index of a given element.
    //    //method takes an int array and it takes a int value
    //    //your method should return an int which is the index of the given value.
    //    //if the value doesnt exist return 0;

    public static int findIndex (int []array, int value){
        for (int i =0; i<=array.length; i++){
            if (array[i]== value){
                return i;
            }
        } return 0;
    }



    //3.   try to create a method which accepts an int array
        //and returns a sorted int array

    public static int []sortedArray (int [] array){
        for (int i =0; i< array.length; i++){
            int smallestIndex = i;
            for(int j = i+1;j< array.length;j++){
                if(array[j]<array[smallestIndex]){
                    smallestIndex=j;
                }
            } int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
        return array;
    }




    public static void main(String[] args) {
        //calling function findindex
        int [] array = {4,2,3,6,7};
        int index = findIndex(array,6);
        System.out.println(index);


        //calling function sorted array
        int [] sortedArray = sortedArray(array);
        for (int i =0; i< array.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();

        //calling function tictactoe

        char[][] ticktacktoeArr = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j = 0; j<3;j++) {
                ticktacktoeArr[i][j] = ' ';
            }
        }
        Scanner sc = new Scanner (System.in);
        boolean x_turn = true;
        int row,column;
        String line;
        while(!gameOver(ticktacktoeArr)) {
            if (x_turn) {
                System.out.print("Enter X -> ");
                line = sc.nextLine();
                String[] indeces = line.split(",");
                row = Integer.parseInt(indeces[0]);//--> converting int.
                column = Integer.parseInt(indeces[1]);
                ticktacktoeArr[row][column] = 'x';

            } else {
                System.out.print("Enter O -> ");
                line = sc.nextLine();
                String[] indeces = line.split(",");
                row = Integer.parseInt(indeces[0]);//--> converting int.
                column = Integer.parseInt(indeces[1]);
                ticktacktoeArr[row][column] = 'o';
            }
            x_turn = !x_turn;
            printGrid(ticktacktoeArr);
        }

        }


}
