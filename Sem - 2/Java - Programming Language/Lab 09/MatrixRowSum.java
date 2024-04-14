import java.util.Scanner;

class RowSumThread extends Thread {
    int[] row;
    int sum;

    public RowSumThread(int[] row) {
        this.row = row;
        this.sum = 0;
    }

    public void run() {
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
    }
}

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        RowSumThread[] threads = new RowSumThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i]);
            threads[i].start();
        }

        // try {
        //     for (int i = 0; i < m; i++) {
        //         threads[i].join();
        //     }
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        System.out.println("Sum of elements in each row:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ": " + threads[i].sum);
        }

        sc.close();
    }
}

