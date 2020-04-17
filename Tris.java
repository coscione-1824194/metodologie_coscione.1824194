import java.util.Random;
public class Tris {
	private Random random;
	private ScacchieraTris scacchiera;
	public static void main(String[] args) {
		Tris tris=new Tris();
		tris.gioca();
	}
	public Tris() {
		scacchiera = new ScacchieraTris();
		random = new Random();
	}
	public void gioca() {
		char winner = ScacchieraTris.PARI;
		while(winner==ScacchieraTris.PARI && scacchiera.getDecisioni()<9) {
			int i=0;
			int j=0;
			while ( ! scacchiera.scrivi (i, j)) {
				i = random.nextInt ( 3 );
				j = random.nextInt ( 3 );
			}

			winner = scacchiera.winner();
			System.out.println(scacchiera);
		}

		if (winner ==  ScacchieraTris.PARI) {
			System.out.print(scacchiera);
			System.out.println(" Nessun vincitore ");
		}
		else {
			if (scacchiera.getDecisioni()>4) {
				System.out.print(scacchiera);
				System.out.println( " Il vincitore è "  + winner + " in "+ scacchiera.getDecisioni()+"mosse");}
			else	System.out.println("pareggio");
		}
	}
	
}
