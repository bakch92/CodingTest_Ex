package 코딩테스트_준비.레벨1;

import java.util.ArrayList;

public class 폰켓몬 {
    public static void main(String[] args) {

        int[] 포켓몬번호 = {3,1,2,3};

        System.out.println(solution(포켓몬번호));
    }

    public static int solution(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int count = nums.length / 2;

        for(int num : nums) {
            if(count == 0) {
                break;
            }
            if(!list.contains(num)) {
                list.add(num);
                count --;
            }
        }

        int answer = list.size();
        return answer;
    }
}
