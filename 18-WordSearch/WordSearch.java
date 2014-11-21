public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH(String w, int row, int col, boolean right){
	try {
	    int c = col;
	    for (int i=0; i < w.length();i++){
		if (board[row][c]==w.charAt(i) || board[row][c]=='.'){
		    board[row][c] = w.charAt(i);
		    if (right==true) c++;
		    else c--;
		}
	    }
	}
	catch (Exception e){}
    }
    public void addWordV(String w, int row, int col, boolean down){
	try {
	    int r = row;
	    for (int i=0; i < w.length();i++){
		if (board[r][col]==w.charAt(i) || board[row][c]=='.'){
		    board[r][col] = w.charAt(i);
		    if (down==true) r++;
		    else r--;
		}
	    }
	}
	catch (Exception e){}
    }
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH("hello",3,15,true); // should work
	w.addWordH("look",1,14,false); // test writing right to left
	w.addWordH("look",3,14,true); // test illegal overlap
       	w.addWordH("look",3,18,true); // test legal overlap
	w.addWordH("look",-3,20,true); // test illegal row
	w.addWordH("look",3,55,true); // test illegal col
	System.out.println(w);
    }
}
