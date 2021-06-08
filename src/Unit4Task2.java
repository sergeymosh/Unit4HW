import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mass = new int[n][n];

        System.out.println("Исходная матрица: ");
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j]+ "  ");
            }
            System.out.println();
        }

        System.out.println("Нечетные элементы находящиеся под главной диагональю");
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(mass[i][j]%2!=0) {
                    System.out.print(mass[i][j] +" ");
                }
            }
        }
    }
}
