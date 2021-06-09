import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
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

        System.out.println("Cумма четных элементов стоящих на главной диагонали");
        int sum = 0;
        for(int i = 0;i<n;i++){
            int j = i;
            if(mass[i][j]%2==0){
                sum+=sum+mass[i][j];
            }
        }
        System.out.println(sum);
    }
}
