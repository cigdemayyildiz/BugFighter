package BugFighter;

public class A30ForEachMultidimensionalArray {

    public static void main(String[] args) {

        // for (dataTypeOfArray[] nameOfForEach : nameOfArray) {} --> foreach syntax
        //      for (dataTypeOfArray : nameOfForEach(for this for) : nameOfFirstForEach){}

        int[][] list = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for (int [] row : list) { // tabloda int[] (int Array tipinde) satirlar olacak
            for (int column : row) { // ve o satirlarin icinde de sutunlar olacak
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
