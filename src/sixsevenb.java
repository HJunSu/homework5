import java.util.Scanner;

public class sixsevenb {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String a = sc.nextLine();
            if(a.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            String s[] = a.split(" ");
            int n = s.length;
            System.out.println("어절 개수는 "+ n);
        }
    }
}