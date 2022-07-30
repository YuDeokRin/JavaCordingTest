package Programmers.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        int a= 10;
        List<Integer> list = new ArrayList<Integer>();


        for(int num : arr){
            if(a != num) list.add(num);
            a = num ;
        }



        answer = new int[list.size()];
        for(int i = 0; i< answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}
