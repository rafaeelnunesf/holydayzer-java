import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Holidays holidays = new Holidays();
        
        System.out.println("Enter the date of the desired holiday or 'all' to see all holidays:");
        String userInput = scanner.nextLine();

        if (userInput.equals("all")) {
            holidays.getAllHolidays();
        } else {
            System.out.println(holidays.getHoliday(userInput));
        }    
    }
}