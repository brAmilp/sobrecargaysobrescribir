package Sobrecarga;

public class juan {

    private String nombre;

    public juan(String nombre) {
        setnombre(nombre);
    }

    private void setnombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
/*Primer Metodo */
    public void saludar(String nombrePersona) {
        System.out.println("hola "+ nombrePersona + ", soy "+ nombre);
    }
/* Segundo Metodo */
    public void saludar(){
        System.out.println("Hola sujeto, soy "+ nombre);
    }
}
