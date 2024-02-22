import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world");
        int number = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            if (20 >= number && number > 10){
                System.out.println("Skaitlis ir lielaks par 10");
            }
            else if (number > 20){
                System.out.println("Skaitlis ir lielaks par 20");
            }
            else {
                System.out.println("Skaitlis ir negativs");
            }
            number++;
        }
        System.out.println("Programa ir apstradata");
    }
}
