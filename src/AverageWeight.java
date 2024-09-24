import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] weights = new double[10];
        int total = 0;
        for (int i = 0; i <weights.length; i++) {
            weights[i] = scanner.nextDouble();
            total+=weights[i];
        }
        scanner.close();
        System.out.println((double)total/weights.length);
    }
}
