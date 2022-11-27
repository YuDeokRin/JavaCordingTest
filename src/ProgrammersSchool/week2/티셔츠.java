package ProgrammersSchool.week2;


import java.util.*;


class 티셔츠 {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int i = 0;
        int j = 0;
        int len = tshirts.length;

        while(i<len){
            if(tshirts[i] >= people[j]){
                i++;
                j++;
                answer++;
            }else{
                i++;
            }
        }
        return answer;
    }
}
