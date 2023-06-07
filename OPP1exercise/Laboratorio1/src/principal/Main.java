package principal;


import flechaProcess.Flecha;

public class Main {
	


	public static void main(String[] args) {

		Flecha miFlecha = new Flecha();
		miFlecha.construirFlecha();
        miFlecha.imprimirEspacio();

        Flecha flechaRoja = new Flecha(10, "Rojo");
        flechaRoja.construirFlecha();
        flechaRoja.imprimirEspacio();

	}
	
}

