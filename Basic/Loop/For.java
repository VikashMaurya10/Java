package Basic.Loop;

import java.util.Scanner;

        class For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row;
        int colomn;
        String Symbol = " ";
        System.out.println("Enter # row: ");
        row = scan.nextInt();
        System.out.println("Enter # colomn: ");
        colomn = scan.nextInt();
        System.out.println("Enter # Sumbol: ");
        Symbol = scan.next();
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= colomn; j++) {
                System.out.print(Symbol);
            }
        }
        scan.close();
    }
}
