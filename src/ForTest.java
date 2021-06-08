import java.util.Random;
import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();

        int[][] mass = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                mass[i][j] = random.nextInt(9);
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }
}
