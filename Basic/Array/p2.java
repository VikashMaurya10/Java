package Basic.Array;

public class p2 {
    public static void main(String[] args) {
        int names[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < names.length; i++) {
            System.out.println();
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
        }
    }
}
