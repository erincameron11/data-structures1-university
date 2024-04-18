package assignmentfour;

public class DelimiterData {
	
	private int column = 0;
	private int line = 0;
	private char character;
	
	public DelimiterData(int line, int column, char character) {
		this.line = line;
		this.column = column;
		this.character = character;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
	
	
}
