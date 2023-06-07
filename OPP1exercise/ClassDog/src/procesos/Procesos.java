package procesos;

public class Procesos {
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    public Procesos(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  
    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }
}
