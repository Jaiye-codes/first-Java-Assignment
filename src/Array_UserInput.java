import java.util.Scanner;
public class Array_UserInput {
    public static void main (String [] args){
        int [] numbers = new int [10];
        Scanner scanner = new Scanner (System.in);
        for ( int i=0; i< numbers.length; i++){
            System.out.print("Enter a value for index "+ i + ";");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("\n The values entered are: ");
         for ( int num: numbers){
             System.out.println(num);
         }
         scanner.close();
    }
}
