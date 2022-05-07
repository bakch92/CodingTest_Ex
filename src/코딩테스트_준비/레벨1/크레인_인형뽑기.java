package 코딩테스트_준비.레벨1;

import java.util.ArrayList;

public class 크레인_인형뽑기 {

    public static void main(String[] args) {

        int[][] board = new int[][] {{0,0,0,0,0,1},
                                    {0,0,1,0,3,4},
                                    {0,2,5,0,1,2},
                                    {4,2,4,4,2,3},
                                    {3,5,1,3,1,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {

        ArrayList<Integer> list = new ArrayList<>();

        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int boardNum = board[j][moves[i] - 1];
                if (boardNum != 0) {
                    if(boardNum > 0) {
                        list.add(boardNum);
                        board[j][moves[i] - 1] = 0;
                        break;
                    }
                }
            }

            for(int k=0; k<list.size()-1; k++) {
                if(list.get(k) == list.get(k+1)) {
                    list.remove(k);
                    list.remove(k);
                    k -= 1;
                    answer += 2;
                }
            }
        }
        return answer;
    }
}
