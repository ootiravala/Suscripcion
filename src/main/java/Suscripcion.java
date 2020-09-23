
public abstract class Suscripcion {

	private int desayuno;
	private int almuerzo;
	private int cena;
	
	public Suscripcion(int desayuno, int almuerzo, int cena) {
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
	}
	
	public abstract int calcular ();

	public int getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(int desayuno) {
		this.desayuno = desayuno;
	}

	public int getAlmuerzo() {
		return almuerzo;
	}

	public void setAlmuerzo(int almuerzo) {
		this.almuerzo = almuerzo;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
	
}
