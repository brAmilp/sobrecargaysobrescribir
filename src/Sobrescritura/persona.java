package Sobrescritura;

public class persona extends animal {

    /*Clase persona sobrescrita de la clases padre*/
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sobre la mesa");
    }
}
