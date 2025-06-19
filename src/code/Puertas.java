package code;

public record Puertas(Boolean puerta1, Boolean puerta2, Boolean puerta3) {
	
	public Puertas{
		checkPuertas(puerta1, puerta2, puerta3);
	}
	
	private void checkPuertas(Boolean puerta1, Boolean puerta2, Boolean puerta3) {
		int trueCount = 0;
		if (puerta1) trueCount++;
		if (puerta2) trueCount++;
		if (puerta3) trueCount++;
		
		if (trueCount != 1) {
			throw new IllegalArgumentException("Debe haber exactamente una puerta True y dos False");
		}
	}

	public Boolean getPuerta(Integer i){
		if (i == 1) return puerta1;
		if (i == 2) return puerta2;
		if (i == 3) return puerta3;
		else throw new IllegalArgumentException("Número de puerta no válida");
	}

}
