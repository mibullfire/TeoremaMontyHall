package code;

public class TeoremaConCambio {
	/*
	 * En este código se presenta la opción en el caso de que no se mantenga la puerta elegida, 
     * teniendo en cuenta de que conocemos cual de las otras dos puertas no tiene premio.
	 */
	
	public static void main (String [] args) {

		Integer repeticiones = 10000000;
		Integer victoria = 0;

		for (int i = 0; i < repeticiones; i++){

			Puertas situacion = crearSituacion();

			int eleccion = (int) (Math.random() * 3) + 1;

            if (situacion.getPuerta((eleccion + 1) % 3 + 1) == Boolean.FALSE) {
                if (situacion.getPuerta((eleccion + 2) % 3 + 1) == Boolean.TRUE) {
                    victoria++;
                }
            }
            if (situacion.getPuerta((int) (eleccion + 2) % 3 + 1) == Boolean.FALSE) {
                if (situacion.getPuerta((int) (eleccion + 1) % 3 + 1) == Boolean.TRUE) {
                    victoria++;
                }
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
