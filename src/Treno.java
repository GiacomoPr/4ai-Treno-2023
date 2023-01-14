/**
 * *<b> classe treno </b>
 * <p> array oggetti </p>
 * <p> dati di ingresso :</p>
 * <UL>
 * <LI< nome
 * <LI> destinazione
 * <LI> vagoni massimi
 * </UL>
 * @author Portaccio Giacomo
 *
 */
public class Treno {
	/**
	 * nome=nome del treno
	 */
	private String nome;
	private String destinazione;
	private int numMaxV;
	private Vagone[] vagoni;
	/**
	 * 
	 * @param nome
	 * @param destinazione
	 * @param numMaxV
	 */

	public Treno(String nome, String destinazione, int numMaxV) {
		super();
		this.nome = nome;
		this.destinazione = destinazione;
		this.numMaxV = numMaxV;
		vagoni = new Vagone[numMaxV];   //2array di oggetti
	}
	//aggiunta oggetto ad array
	public boolean addVagone(int pos, Vagone vag) {
		vagoni[pos]= vag;
		
		return true;
	}
	public boolean elimVag(int pos) {
		if(vagoni[pos]!=null) {
			vagoni[pos]=new Vagone(null,0);
			return true;
			}
		return false;
	}
	/**
	 * @return metodo che restituisce il treno completo
	 */
	public String toString() {
		String s="nome treno: "+nome+ " destinazione: "+destinazione+" vagoni max:"+numMaxV;
		
		for(int i=0; i<vagoni.length; i++) {
			if(vagoni[i]!=null)
				s+=vagoni[i]+"\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		Treno t1 = new Treno("freccia rossa", "Milano", 10);
		
		Vagone v1=new Vagone("Prima",90);
		Vagone v2=new Vagone("seconda",50);
		t1.addVagone(0, v1);
		t1.addVagone(0, v2);
		System.out.println(t1.addVagone(0, v1));
		System.out.println(t1.addVagone(1, v2));
		System.out.println(t1);
	}
}
