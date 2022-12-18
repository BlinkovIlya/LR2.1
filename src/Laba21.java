import java.util.regex.*;
import java.util.Scanner;
public class Laba21 {public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите дату: ");
    String data;
    data = sc.nextLine();
    String pattern = "(?:[0-9]{2}[\\/]){2}[0-9]{4}+";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(data);
    if (m.matches()) {
        int day = Integer.parseInt(data.substring(0, 2));
        int month = Integer.parseInt(data.substring(3, 5));
        if ((month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12 & day <= 31) | ((month == 4 | month == 6 | month == 9 | month == 11) & day <= 30) | (month == 2 & day <= 28)) {
            int year = Integer.parseInt(data.substring(6, 10));
            if (year >= 1990 & year <= 9999) {
                System.out.println("Введенное выражение является датой!");
            }
        } else {
            System.out.print("Введенное выражение не является датой!");
        }
    }
    else{
        System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy!");
    }
}
}