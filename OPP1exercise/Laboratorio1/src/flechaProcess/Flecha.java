package flechaProcess;

public class Flecha {
private int longitud;
String color;

public Flecha() {
	longitud=18;
	color="Negro";
}

public Flecha(int longitud, String color) {
	this.longitud=longitud;
	this.color=color;
}

public void imprimirEspacio() {
	System.out.println();
}

public void construirFlecha() {
	for (int i = 0; i < longitud; i++) {
		imprime("-");
		
	}
	imprime(">");
	
}

private void imprime(String simbolo) {
	if(color.equals("negro")) {
		System.out.print(simbolo);
	}else {
		System.err.print(simbolo);
	}
}



}
