public class AmericanFlagSingle {
    public static void main (String[] args){
        int rows =6;
        int columns =14;
        for ( int i= 0; i< rows * columns; i++){
            int row = i/ columns;
            int col = i% columns;
            if (rows< 3){
                if (col< 7){
                    System.out.print(" * ");
                }else {
                    System.out.print(" = ");
                }
            }else {
                    System.out.print(" * ");
                }
        }
            System.out.println();;
    }
}
