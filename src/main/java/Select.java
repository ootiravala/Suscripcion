
public class Select extends Suscripcion {

	public Select(int desayuno, int almuerzo, int cena) {
		super(desayuno, almuerzo, cena);
	}

	@Override
	public int calcular() {
		return getDesayuno() + getAlmuerzo() + getCena();
	}

	
	
}
