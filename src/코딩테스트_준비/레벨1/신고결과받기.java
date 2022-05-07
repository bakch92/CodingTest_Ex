package 코딩테스트_준비.레벨1;

import java.util.ArrayList;
import java.util.Arrays;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 1;

       solution(id_list,report,k);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportCountArr = new int[id_list.length];

        ArrayList<String> reportTemp = new ArrayList<>();
        for(String str : report) {
            if(!reportTemp.contains(str)) {
                reportTemp.add(str);
            }
        }

        System.out.println(reportTemp);

        for (String str : reportTemp) {
            String temp = str.split(" ")[1];
            System.out.println("-------");
            System.out.println(str);
            System.out.println(temp);
           reportCountArr[Arrays.asList(id_list).indexOf(temp)]++;
        }
        System.out.println("reportCount : "  + Arrays.toString(reportCountArr));
        for(int i=0; i<reportCountArr.length; i++) {
            if(reportCountArr[i] >= k) {
                String reportPerson = id_list[i];
                System.out.println("report-person : " + reportPerson);
                for(String str : reportTemp) {
                    if(reportPerson.equals(str.split(" ")[1])) {
                        answer[Arrays.asList(id_list).indexOf(str.split(" ")[0])]++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
