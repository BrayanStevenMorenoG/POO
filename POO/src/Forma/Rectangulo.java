package Forma;

public class Rectangulo extends Figura{

    //atributos de la subclase
    private float base, altura;

    //Metodo constructor
    public Rectangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    //Metodos accesores
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Metodo de la subclase
    public void calcularArea(){
        float area=0;
        area = base*altura;
        System.out.println("La base del rectagulo es "+base+" su altura es "+altura+" y su area es "+area);
    }

}