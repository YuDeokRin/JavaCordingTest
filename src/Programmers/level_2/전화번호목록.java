package Programmers.level_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phone_book);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return answer;
    }

    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }


        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        전화번호목록 T = new 전화번호목록();
//        System.out.println(T.solution(new String[]{"119", "97674223", "1195524421"}));

        System.out.println(T.solution2(new String[]{"123","456","789"}));
    }
}
