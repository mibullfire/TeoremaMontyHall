package code;

public class TeoremaSinCambiar {
	/*
	 * En este código se presenta la opción en el caso de que se mantenga la puerta elegida.
	 */
	
	public static void main (String [] args) {

		Integer repeticiones = 100000;
		Integer victoria = 0;

		for (int i = 0; i < repeticiones; i++){

			Puertas situacion = crearSituacion();

			int eleccion = (int) (Math.random() * 3) + 1;

			if (situacion.getPuerta(eleccion) == Boolean.TRUE) {
				victoria++;
			}
		}

		Double probabilidad = Double.valueOf(victoria) / Double.valueOf(repeticiones);
		System.out.println(probabilidad);
		
	}

	private static Puertas crearSituacion(){
		Boolean p1 = Boolean.TRUE;
		Boolean p2 = Boolean.FALSE;
		Boolean p3 = Boolean.FALSE;

		Boolean[] puertas = {p1, p2, p3};
		java.util.Collections.shuffle(java.util.Arrays.asList(puertas));
		return new Puertas(puertas[0], puertas[1], puertas[2]);
	}

}
