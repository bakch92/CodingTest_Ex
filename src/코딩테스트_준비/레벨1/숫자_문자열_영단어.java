package 코딩테스트_준비.레벨1;

import java.util.HashMap;
import java.util.Map;

public class 숫자_문자열_영단어 {

    public static void main(String[] args) {
        solution("23four5six7");
    }

    public static int solution(String s) {
        Map<Integer,String> list = new HashMap<>();
        String[] strList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i< strList.length; i++) {
            list.put(i, strList[i]);
        }

        for(int key : list.keySet()) {
            boolean isTarget = s.contains(list.get(key));

            if(isTarget) {
                String str = list.get(key);
                String strKey = String.valueOf(key);
                s = s.replace(str, strKey);
            }
        }

        int answer = Integer.valueOf(s);
        System.out.println(answer);
        return answer;
    }
}
