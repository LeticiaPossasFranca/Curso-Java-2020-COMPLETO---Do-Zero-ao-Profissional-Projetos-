package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) X 5/9 = °C
		// ajuste e fator constantes
		final double AJUSTE = 32;
		final double FATOR = 5.0/9;
		
		double fahrenheit = 86;
		
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celcius);
		
	}
}
