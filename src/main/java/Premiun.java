
public class Premiun extends Suscripcion {

	private int palto1;
	private int plato2;

	public Premiun(int desayuno, int almuerzo, int cena, int palto1, int plato2) {
		super(desayuno, almuerzo, cena);
		this.palto1 = palto1;
		this.plato2 = plato2;
	}

	@Override
	public int calcular() {
		return getDesayuno() + getAlmuerzo() + getCena() + palto1 + plato2 ;
	}

	public int getPalto1() {
		return palto1;
	}

	public void setPalto1(int palto1) {
		this.palto1 = palto1;
	}

	public int getPlato2() {
		return plato2;
	}

	public void setPlato2(int plato2) {
		this.plato2 = plato2;
	}

}
