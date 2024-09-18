class Solution {
    public void gameOfLife(int[][] board) {

        int [] x = new int[]{0,1,1,1,0,-1,-1,-1};
        int [] y = new int[]{1,1,0,-1,-1,-1,0,1};

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                int count=0;
                for(int n=0; n<8; n++){
                    if (i + x[n] < 0 || j + y[n] < 0 || i + x[n] >= board.length || j + y[n] >= board[0].length) continue;

                    if (Math.abs(board[i + x[n]][j + y[n]]) == 1){
                        count++;
                    }
                }

                //rules
                if (board[i][j]==1){
                    if (count<2 || count>3) board[i][j] = -1;
                }else{
                    if (count == 3) board[i][j] = 2;
                }
            }
        }

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if (board[i][j] >= 1){
                    board[i][j] = 1;
                }else{
                    board[i][j] = 0;
                }
            }
        }
    }

}