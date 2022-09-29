package classe.Dipendente;


public class Dipendente {
	
private static double  stipendioBase = 1000;
		   
public String nome;
		   
private int matricola;
		   
static double stipendio;
		   
static  Livello livello;
		   
static Dipartimento dipart;
		   
public double stipendioOrarioStraordinario;
	
int importoOrarioStraordinario;

	 
							   
	public Dipendente(
			String _nome,
			int _matricola,
			Dipartimento _dipart )
	
	{
		matricola = _matricola;
		nome = _nome;
		dipart = _dipart;
		stipendio = stipendioBase;
	    importoOrarioStraordinario = 30;
		livello = Livello.OPERAIO;
		
	}
	
	public Dipendente(
			String _nome,
			int _matricola,
			int _importoOrarioStraordinario,
			Livello _level,
			Dipartimento _depart,
			int _stipendioBase,
			int _stipendio)
			
	{
		matricola = _matricola;
		nome = _nome;
		importoOrarioStraordinario = _importoOrarioStraordinario;
		livello = _level;
		dipart = _depart;
		stipendio = calcolaPaga();
		
		
		
	}
	
	public static void stampaDatiDipendente() {
		
	}
	
	private static double calcolaPaga() {
		double paga = 0;
		
		if(livello == livello.IMPIEGATO) {
			paga = stipendioBase * 1.2;
		}else if(livello == livello.QUADRO) {
			paga = stipendioBase * 1.5;
		}else if(livello == livello.DIRIGENTE) {
			paga = stipendioBase * 2;
		}
		
		return stipendio = paga;
	}
	
	public double getPaga() {
		
		return stipendio;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
