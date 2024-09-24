import java.util.Scanner;

enum Weekdays {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}
public class UsingEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 : ");
        int dayOfTheWeek = scanner.nextInt();
        scanner.close();
        Weekdays[] arr = Weekdays.values();
        System.out.println(arr[dayOfTheWeek-1]);
    }
}
