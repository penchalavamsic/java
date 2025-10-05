//HallowDiamond
class HallowDiamond {
    public static void main(String args[]) {
        int n = 5; // number of rows for half diamond

        // Top half
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars and inside spaces
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*"); // borders
                } else {
                    System.out.print(" "); // hollow inside
                }
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 2; i >= 0; i--) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars and inside spaces
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*"); // borders
                } else {
                    System.out.print(" "); // hollow inside
                }
            }
            System.out.println();
        }
    }
}
