import java.util.Scanner;

public class revert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        int length = input.length();
        for (int i = length; i > 0; i --){
            System.out.print(input.charAt(i - 1));
        }
    }
}