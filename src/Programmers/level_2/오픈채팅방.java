package Programmers.level_2;

import java.util.*;
/*
    Lv2. 오픈채팅방 (2019 KAKAO BLIND RECRUITMENT)

    -문제
    https://school.programmers.co.kr/learn/courses/30/lessons/42888
    너무 길어서 링크 참조

    제한사항
        -record는 다음과 같은 문자열이 담긴 배열이며, 길이는 1 이상 100,000 이하이다.

    다음은 record에 담긴 문자열에 대한 설명이다.
        -모든 유저는 [유저 아이디]로 구분한다.
        -[유저 아이디] 사용자가 [닉네임]으로 채팅방에 입장 - "Enter [유저 아이디] [닉네임]" (ex. "Enter uid1234 Muzi")
        -[유저 아이디] 사용자가 채팅방에서 퇴장 - "Leave [유저 아이디]" (ex. "Leave uid1234")
        -[유저 아이디] 사용자가 닉네임을 [닉네임]으로 변경 - "Change [유저 아이디] [닉네임]" (ex. "Change uid1234 Muzi")
        -첫 단어는 Enter, Leave, Change 중 하나이다.
        -각 단어는 공백으로 구분되어 있으며, 알파벳 대문자, 소문자, 숫자로만 이루어져있다.
        -유저 아이디와 닉네임은 알파벳 대문자, 소문자를 구별한다.
        -유저 아이디와 닉네임의 길이는 1 이상 10 이하이다.
        -채팅방에서 나간 유저가 닉네임을 변경하는 등 잘못 된 입력은 주어지지 않는다.


    -입력 예제)
    record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]

    -출력 예제)
    result = ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]

 */

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>(); // 기록 저장소

        Map<String, String> Id = new HashMap<>(); // key : Id저장 , value : 닉네임 저장
        for (int i = 0; i < record.length; i++) {

            String[] temp = record[i].split(" ");
            // temp[0] = [Enter, Enter, Leave, Enter, Change]; == Command
            // temp[1] = [uid1234, uid4567, uid1234, uid1234, uid4567]  == ID
            // temp[2] = [Muzi, Prodo] == Nickname

            if (temp[0].equals("Enter")) {
                Id.put(temp[1], temp[2]); //key = temp[1] =[uid1234, uid4567, uid1234, uid1234, uid4567]
                                          //value = temp[2] = [Muzi, Prodo]
                result.add(temp[1] + "님이 들어왔습니다.");
            } else if (temp[0].equals("Leave")) {
                result.add(temp[1] + "님이 나갔습니다.");
            } else if (temp[0].equals("Change")) {
                Id.replace(temp[1], temp[2]);
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            int idIndex = result.get(i).indexOf("님");
            String id = result.get(i).substring(0, idIndex); // 0부터 님이라는 단어까지 ->id만 빼오기위해
            answer[i] = Id.get(id) + result.get(i).substring(idIndex);
        }
        return answer;
    }


    public static void main(String[] args) {
        오픈채팅방 T = new 오픈채팅방();
        String[] record = {"Enter uid1234 Muzi"
                          ,"Enter uid4567 Prodo"
                          ,"Leave uid1234"
                          ,"Enter uid1234 Prodo"
                          ,"Change uid4567 Ryan"
        };

        System.out.println(Arrays.toString(T.solution(record)));


        List<String> result = new ArrayList<>();

        Map<String, String> Id = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] temp = record[i].split(" "); //" "쓰기를 기준으로 split해준다.
            // temp[0] = [Enter, Enter, Leave, Enter, Change] ;
            // temp[1] = [uid1234, uid4567, uid1234, uid1234, uid4567]
            // temp[2] = [Muzi, Prodo]

            if (temp[0].equals("Enter")) {
                Id.put(temp[1], temp[2]);
                result.add(temp[1] + "님이 들어왔습니다.");
            } else if (temp[0].equals("Leave")) {
                result.add(temp[1] + "님이 나갔습니다.");
            } else if (temp[0].equals("Change")) {
                Id.replace(temp[1], temp[2]); // Muzi -> Prodo로 변경
            }
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            int idIndex =result.get(i).indexOf("님");
            String id = result.get(i).substring(0, idIndex);
            answer[i] = Id.get(id) + result.get(i).substring(idIndex);
        }

        System.out.println(Arrays.toString(answer));
    }
}


