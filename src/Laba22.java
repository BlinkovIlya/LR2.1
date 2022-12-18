import java.util.regex.*;
import java.util.Scanner;

public class Laba22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            boolean x = false;
            System.out.print("Пароль: ");
            String password = sc.next();
            if (password.length() < 8){
                System.out.print("Пароль ненадежен. Повторите ввод:");
                continue;
            }
            for (int i = 0; i < password.length(); i++){
                String pass1 = password.substring(i,i+1);
                Pattern p1=Pattern.compile("[a-z]");
                Pattern p2=Pattern.compile("[A-Z]");
                Pattern p3=Pattern.compile("[0-9]");
                Pattern p4=Pattern.compile("[/_]");
                Matcher m1=p1.matcher(pass1);
                Matcher m2=p2.matcher(pass1);
                Matcher m3=p3.matcher(pass1);
                Matcher m4=p4.matcher(pass1);
                if (m1.matches()){
                    a++;
                    continue;
                }
                else if (m2.matches()){
                    b++;
                    continue;
                }
                else if (m3.matches()){
                    c++;
                    continue;
                }
                else if (m4.matches()){
                    d++;
                    continue;
                }
                else{
                    x=true;
                    break;
                }
            }
            if (x){continue;}
            if (a>0 & b>0 & c>0){
                System.out.println("Пароль надежен!");
                break;
            }
        }
    }
}