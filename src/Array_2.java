import java.util.Scanner;
public class Array_2 {
    public static void main (String [] args){
        int [][] Array_2 = new int [2][10];
        Scanner scanner = new Scanner (System.in);
        for (int i=0; i<2; i++){
            for (int j=0; j<=9; j++){
                System.out.print("Enter a value for row " + (i)+ "column "+ (j));
                Array_2[i][j]= scanner.nextInt();
            }
            System.out.println("Array values ");
                for (int [] row: Array_2){
                    for (int value: row){
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    scanner.close();
                }
        }
    }
}
