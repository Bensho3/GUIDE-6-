import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map <Character, Integer> mapChain = new HashMap();

        Scanner s = new Scanner(System.in);
        String screen = s.nextLine();

        for(int i = 0; i < screen.length(); i++ ) {
        System.out.println(screen.charAt(i));
        }


        }
    }
