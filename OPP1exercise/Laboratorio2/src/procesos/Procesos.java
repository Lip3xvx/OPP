package procesos;

import javax.swing.JOptionPane;

public class Procesos {
int num;
int i, neg=0, par=0;

public void entrada() {
	for (int i = 0; i < 5; i++) {
		{
			num=ingresarDatos("digite 1 numero");
			if (num%2==0) {
				par++;
			}
			if (num<0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "El numero de numeros pares es: "+par+ "\n" + "y el numero de numeros negativos es: " +neg);
	}
	
}
	


private int ingresarDatos(String string) {
	String cadena;
	int valor;
	cadena=JOptionPane.showInputDialog(null, string);
	valor=Integer.parseInt(cadena);
	return valor;
}



}
