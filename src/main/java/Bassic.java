
public class Bassic extends Suscripcion {

	public Bassic(int desayuno, int almuerzo, int cena) {
		super(desayuno, almuerzo, cena);
		
	}

	@Override
	public int calcular() {
		return getDesayuno() + getAlmuerzo() + getCena();
	}

	

}
