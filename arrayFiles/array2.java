public class array2 {
    public static void main(String[] args) {    // just to print
        int [][] evenArray = new int[5][5];







        for (int row = 0; row < evenArray.length; row++){
            for (int col = 0; col < evenArray[row].length; col++){
                System.out.print(evenArray[row][col]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");





    }

}
