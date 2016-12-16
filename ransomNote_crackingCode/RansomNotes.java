import java.util.*;

public class RansomNotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String, Integer> magazine = new HashMap<>();
        //aa->1,bb->1,cc->,aa->2,aa->3,bb->2
        for (int i = 0; i < m; i++) {
            String word = in.next();
            magazine.put(word, magazine.getOrDefault(word, 0) + 1);
        }
        //aa->1,aa->2,bb->3
        HashMap<String, Integer> ransom = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = in.next();
            ransom.put(word, ransom.getOrDefault(word, 0) + 1);
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : ransom.entrySet()) {
            Integer num=magazine.get(entry.getKey());
            if(num == null ){
                System.out.println("No");
                count++;
                break;
            }else if(entry.getValue()> num){
                System.out.println("No");
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("Yes");
        }

    }

}
