public class AmericanFlagNested {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 14;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < 3) { // Top 3 rows
                    if (j < 7) { // First 7 columns
                        System.out.print(" * ");
                    } else { // Remaining columns
                        System.out.print(" = ");
                    }
                } else { // Bottom rows
                    System.out.print(" = ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
