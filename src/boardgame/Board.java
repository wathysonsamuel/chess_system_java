package boardgame;

// Representa o tabuleiro do jogo genérico (pode ser xadrez ou outro jogo de tabuleiro)
public class Board {
	
	private int rows; // número de linhas do tabuleiro
	private int columns; // número de colunas do tabuleiro
	private Piece[][] pieces; // matriz que representa o tabuleiro com suas peças
	
	// Construtor que inicializa o tabuleiro com as dimensões fornecidas
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // cria a matriz de peças vazia
	}

	// Getters e Setters das dimensões do tabuleiro
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// Retorna a peça presente em uma posição específica da matriz (linha, coluna)
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// Sobrecarga: retorna a peça presente na posição informada via objeto Position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Coloca uma peça em uma posição do tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; // atualiza a posição da peça (acesso possível porque está no mesmo pacote)
	}
}
