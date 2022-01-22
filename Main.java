import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Building bulding = new Building();
        Integer floor = null;
        while (true){
            System.out.println("Введите этаж: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                floor = (scanner.nextInt());
            }else {
                System.out.println("Ошибка! Введите корректный этаж");
            }
            if(floor != null){
                bulding.callElevator(floor);
            }
        }
    }
}
