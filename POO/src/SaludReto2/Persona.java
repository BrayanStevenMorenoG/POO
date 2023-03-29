package SaludReto2;

import java.util.Scanner;

public class Persona {
    
    //atributos 

    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;

    //metodo de constructor vacio
    public Persona(){

    }

    //metodos





    public void pedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su tipo de documento");
        tipoDoc  = leer.next();
        System.out.println("Digite su documento");
        documento  = leer.nextInt();
        System.out.println("Digite su nombre");
        nombre  = leer.next();
        System.out.println("Digite su apellido");
        apellido  = leer.next();
        System.out.println("Digite su  edad");
        edad  = leer.nextInt();
        System.out.println("Digite su sexo");
        sexo  = leer.next();
    }

    public void mostrarPersona(){
        System.out.println("Su tipo de documento es: "+tipoDoc);
        System.out.println("Su numero de documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su sexo es: "+sexo);
    }

    public double calcularImc(double peso, double estatura){
        double pesoActual = peso/(estatura*estatura);
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        } else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        } else if (pesoActual>25){
            System.out.println("El peso esta por encima de lo ideal");
        }
        return pesoActual;
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}

