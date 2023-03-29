package Forma;

public class Cuadrado extends Figura{
    
    //atributos de la subclase
    private float lado;

    //Metodo constructor
    public Cuadrado (float lado){
        this.lado=lado;
    }

    //Metodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //Metodo de la subclase
    public void calcularArea(){
        float area=0;
        area = lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" y su area es "+area);
    }

}
