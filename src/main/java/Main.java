import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Un cliente puede suscribirse a una empresa que probee comida tiene tres
		 * tarifas, basic, select y premium Basic: incluye desayuno 2 , almuerzo 5, cena
		 * 5 select: desayuno obligatorio 2, opcional almuerzo 6, opcional cena 6
		 * premium: incluye desayuno obligarorio 2, almuerzo obligatorio primer plato 4
		 * segundo plato 3 , cena olbigatoria 6 la tarifa premium tiene un descuento del
		 * 5% CALCULA LA TARIFA ELEGIDA POR EL USUARIO, EL PRECIO TOTAL.
		 */

		// Primer paso preguntar al usuario tipo de tarifa
		// if (tipo) ir cambiando la variable precio de los tres objetos desayuno
		// almuerzo y cena
		// si es opcinal preguntar al usuario
		// sumar y mostrar por pantalla
		Scanner scanner = new Scanner(System.in);
		Suscripcion suscripcion = null;

		String tarifa;

		System.out.println("¿Qué tarifa desea: bassic, select o premiun?");
		tarifa = scanner.next();
		if (tarifa.equals("b")) {

			suscripcion = new Bassic(2, 5, 5);

		} else if (tarifa.equals("s")) {
			System.out.println("Tiene incluido desayuno ¿desea almuerzo?");
			tarifa = scanner.next();
			int almuerzo = 0;
			if (tarifa.equals("s")) {
				almuerzo = 6;
			}
			System.out.println("¿Desea cena?");
			tarifa = scanner.next();
			int cena = 0;
			if (tarifa.equals("s")) {
				almuerzo = 6;
			}
			suscripcion = new Select(2, almuerzo, cena);

		}  else if (tarifa.equals("p")) {

		}

		System.out.println("El coste total es de: " + suscripcion.calcular());

		scanner.close();
	}
}
