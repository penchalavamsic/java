class Diamond{
    public static void main(String args[]) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    int m=5;
        for (int p = m; p> 0; p--) {         
    for (int q = 0; q < m - p; q++) {
        System.out.print(" ");         // spaces increase each row
    }
    for (int r = 0; r < 2 * p - 1; r++) {
        System.out.print("*");
    }
    System.out.println();
}


    }
}
