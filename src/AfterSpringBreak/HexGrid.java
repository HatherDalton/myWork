package AfterSpringBreak;

import java.util.ArrayList;
import java.util.Random;

public class HexGrid {

	private GamePiece[][] grid;

	public int getGamePieceCount() {
		int num = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				if (grid[row][col] != null)
					;
				num++;
			}
		}
		return num;
	}

	public ArrayList<GamePiece> isAbove(int row, int col) {
		if (grid[row][col] == null) {
			return null;
		}
		ArrayList<GamePiece> above = new ArrayList<GamePiece>();
		for (int r = 0; r < row; r++)
			if (grid[row][col] != null)
				above.add(grid[r][col]);
		return above;
	}

	public boolean addRandom(int number) {
		if(getGamePieceCount()+number>grid.length*grid[0].length)
			return false;
		Random num=new Random();
		int min=0;
		int maxr=3;
		int maxc=4;
		while(number>0) {
			int row= min + num.nextInt(maxr-min+1);
			int col= min + num.nextInt(maxc-min+1);
		if(grid[row][col]!=null) {
			//grid.add(grid[row][col]);
			number--;
		}
			}
		return true;
	}
}
