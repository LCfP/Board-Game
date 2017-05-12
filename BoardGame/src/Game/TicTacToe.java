package Game;

public class TicTacToe {
	private int[][] board;

	public TicTacToe(int size)
	{
		board = new int[size][size];
	}

	public boolean makeMove(int x,int y,boolean player1)
	{
		if(board[x][y] == 0)
		{
			if(player1)
			{
				board[x][y] = 1;
				return true;
			}
			else//if player 2
			{
				board[x][y] = -1;
				return true;
			}
		}
		else//if position x,y is already filled
			return false;
	}
	
	public int getSize()
	{
		return board.length;
	}
}
