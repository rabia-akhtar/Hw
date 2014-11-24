import java.util.*;
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

	    int c = col;
	    for (int i=0; i < w.length();i++){
		if (board[row][c]==w.charAt(i) || board[row][c]=='.'){
		    board[row][c] = w.charAt(i);
		    if (right==true) c++;
		    else c--;
		}
	    }
    }
    public void addWordV(String w, int row, int col, boolean down){

	    int r = row;
	    for (int i=0; i < w.length();i++){
		if (board[r][col]==w.charAt(i) || board[r][col]=='.'){
		    board[r][col] = w.charAt(i);
		    if (down==true) r++;
		    else r--;
		}
	    }

    }

    // this is the horizontal method - the 2 booleans decide which way the word will be printed
    //  up to down || left to right and vice versa
 
    public void addWordZ(String w, int row, int col, boolean right, boolean down){

	    int c = row;
	    int r = row;
	    for (int i=0; i < w.length();i++){
		if (board[r][c]==w.charAt(i) || board[r][c]=='.'){
		    board[r][c] = w.charAt(i);
		    if (right==true && down == true) {
			r++;
			c++;}
		    if (right == false && down == true){
			r++;
			c--;
		    }
		    if (right == true && down == false){
			r--;
			c--;
		    }
		    if (right == false && down == false){
			r--;
			c++;
		    }

		}
	    }
	
    }

    public boolean addWord (String w){
	try{
	Random r = new Random ();
	int row = r.nextInt(20);
	int col = r.nextInt(40);
	int m = r.nextInt(3);
	int rig = r.nextInt(2);
	boolean ri= true;
	int d = r.nextInt(2);
	boolean dow=true;
	if (rig ==0) ri=true;
	if (rig==1) ri =false;
	if (d ==0) dow=true;
	if (d==1) dow=false;
	if (m==0)  addWordH (w, row, col, ri);
	if (m==1) addWordV (w,row,col,ri);
	if (m==2) addWordZ (w,row,col,ri,dow);
	return true;
	}
	catch (Exception e){
	    return false;
	}

    }
  

}
