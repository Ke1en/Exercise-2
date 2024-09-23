import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight in kg: ");
        double itemWeight = scanner.nextDouble();
        System.out.println("Item weight in kg " + itemWeight);
        System.out.println("Item weight in g " + itemWeight*1000);
        System.out.println("Item weight in mg " + itemWeight*1000000);

        scanner.close();
    }
}
