package Sobrescritura;

public class Perro extends animal{

    /*Clase sobrescrita de la clase padre */
    @Override
    public void comer(){
            System.out.println("Estoy comiendo con mi platito en el suelo");
    }
}
