package principal;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import procesos.Procesos;

public class Main {
    public static void main(String[] args) {
        ArrayList<Procesos> listaPerros = new ArrayList<Procesos>();
        HashMap<String, Procesos> mapaPerros = new HashMap<String, Procesos>();

        
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú:\n" +
                    "1. Agregar perro\n" +
                    "2. Consulta perro\n" +
                    "3. Lista completa de perros\n" +
                    "4. Salir\n\n" +
                    "Ingrese el número de opción deseada:");

            switch (opcion) {
                case "1":
                  
                    String nombre = JOptionPane.showInputDialog("Nombre del perro:");
                    String raza = JOptionPane.showInputDialog("Raza del perro:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del perro:"));
                    String color = JOptionPane.showInputDialog("Color del perro:");

   
                    Procesos perro = new Procesos(nombre, raza, edad, color);
                    listaPerros.add(perro);
                    mapaPerros.put(perro.getNombre(), perro);
                    break;

                case "2":
 
                    String nombrePerro = JOptionPane.showInputDialog("Ingrese el nombre del perro a consultar:");
                    Procesos perroEncontrado = mapaPerros.get(nombrePerro);
                    if (perroEncontrado != null) {
                        JOptionPane.showMessageDialog(null,
                                "Información de " + nombrePerro + ":\n" +
                                "Raza: " + perroEncontrado.getRaza() + "\n" +
                                "Edad: " + perroEncontrado.getEdad() + "\n" +
                                "Color: " + perroEncontrado.getColor());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún perro con el nombre " + nombrePerro);
                    }
                    break;

                case "3":
          
                    StringBuilder listaCompleta = new StringBuilder("Lista completa de perros:\n\n");
                    for (Procesos perroItem : listaPerros) {
                        listaCompleta.append("Nombre: ").append(perroItem.getNombre()).append("\n");
                        listaCompleta.append("Raza: ").append(perroItem.getRaza()).append("\n");
                        listaCompleta.append("Edad: ").append(perroItem.getEdad()).append("\n");
                        listaCompleta.append("Color: ").append(perroItem.getColor()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, listaCompleta.toString());
                    break;

                case "4":
            
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }

    }

