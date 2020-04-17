import java.util.Random;
public class ScacchieraTris {
	Random random;
	private char[][] scacchiera;
	public static final char X = 'X';
	public static final char O = 'O';
	public static final char PARI = '\0';
	private int decisioni;
	private char giocatore;
	
	public ScacchieraTris() {
		scacchiera = new char[3][3];
		if (Math.random() <0.5)	giocatore = X;
		else	giocatore= O;
	//scelto il giocatore si può iniziare la partita	
	}
	public int getDecisioni() {
		return decisioni;
	}
	public char getGiocatore() {
		return giocatore;
	}
	public char winner() {
		for (int i=0;i<3;i++) {
			if (scacchiera[i][0] == scacchiera [i][1] && scacchiera[i][1]==scacchiera[i][2])
				return scacchiera[i][0];
			if (scacchiera[0][i]==scacchiera[1][i] && scacchiera[1][i]==scacchiera[2][i])
				return scacchiera[0][i];
		}
		if (scacchiera[0][0]==scacchiera[1][1] && scacchiera[1][1]==scacchiera[2][2])
			return scacchiera[0][0];
		if (scacchiera[0][2]==scacchiera[1][1] && scacchiera[1][1]==scacchiera[2][0])
			return scacchiera[0][2];
		return PARI;
	}
	public boolean scrivi(int x,int y) {
		if (scacchiera[x][y]== '\0') {
			scacchiera[x][y]=giocatore;
			if (giocatore=='X')	giocatore='O';
			else giocatore='X';
			decisioni+=1;
			return true;
		}
		else return false;
	}
	public String toString() {
		String out="";
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (j<2)	out+=scacchiera[i][j]+" |";
				else	out+=scacchiera[i][j]+"\n";
			}
		}
		return out;
	}
}
