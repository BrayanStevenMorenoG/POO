package Salud;

import java.util.Scanner;

public class Persona {
    
    //atributos 

    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    private double  peso, estatura;

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
        System.out.println("Digite su peso");
        peso  = leer.nextDouble();
        System.out.println("Digite su estatura");
        estatura  = leer.nextDouble();
        System.out.println("Digite su  edad");
        edad  = leer.nextInt();
        System.out.println("Digite su sexo");
        sexo  = leer.next();
        leer.close();
    }

    public void mostrarPersona(){
        System.out.println("Su tipo de documento es: "+tipoDoc);
        System.out.println("Su numero de documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su sexo es: "+sexo);
    }

    public void calcularImc(){
        double pesoActual = peso/(estatura*estatura);
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        } else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        } else if (pesoActual>25){
            System.out.println("El peso esta por encima de lo ideal");
        }
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor");
        }
    }

}
