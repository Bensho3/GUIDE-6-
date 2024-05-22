import com.sun.source.doctree.EscapeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> mapChain = new HashMap();

        Scanner s = new Scanner(System.in);
        String screen = s.nextLine();

        for (int i = 0; i < screen.length(); i++) {
            mapChain.put(screen.charAt(i), 0);
        }
        for (int i = 0; i < screen.length(); i++)
        {
            if(mapChain.containsKey(screen.charAt(i)))
            {
                Integer cont = mapChain.get(screen.charAt(i));
                if(mapChain.containsKey(screen.charAt(i)))
                {
                    cont++;
                }
                mapChain.put(screen.charAt(i),cont);
            }

        }

        System.out.println("Cantidad de caracteres repetidos:\n" + mapChain.toString());


        }


        }

