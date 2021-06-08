import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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

        System.out.println("Произведение главной диаганали равно: ");
        int proiz1 = 1;
        for(int i = 0;i<n;i++){
            int j = i;
            proiz1 *= mass[i][j];

        }
        System.out.println(proiz1);
        System.out.println("Произведение побочной диаганали равно: ");
        int proiz2 = 1;
        for(int i = 0;i<n;i++){
            int j = n - 1 - i;
            proiz2 *= mass[i][j];

        }
        System.out.println(proiz2);
        System.out.println("----------------------------");
        if(proiz1>proiz2){
            System.out.println("Произведение главной диаганали больше побочной!");
        } else if(proiz1<proiz2){
            System.out.println("Произведение побочной диаганали больше главной!");
        } else {
            System.out.println("Произведения главной и побочных диагонлей равны");
        }
        }
}
