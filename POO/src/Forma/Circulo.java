package Forma;

public class Circulo extends Figura{

    //atributos de la subclase
    private float radio;

    //Metodo constructor
    public Circulo (float radio){
        this.radio=radio;
    }

    //Metodos accesores
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //Metodo de la subclase
    public void calcularArea(){
        double area=0;
        area = 3.16*(radio*radio);
        System.out.println("El radio del circulo es "+radio+" y su area es "+area);
    }

}
