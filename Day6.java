public class Day6 {
    public static void main(String[] args) {
        
        int[] squareArray = {10, 20, 30, 40, 50};
        for(int i=0; i<=squareArray.length; i++){
            int num = squareArray[i];
            int square = num * num;
            System.out.println(num + " squared is " + square);
        }
    }
}
