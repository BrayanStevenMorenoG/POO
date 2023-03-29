package Forma;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        float lado, base, altura, radio; 
        String deci, op;
        Scanner leer = new Scanner(System.in);

        do {

            System.out.println("A cual figura desea calcular su area? Cuadrado|Rectangulo|Circulo|Triangulo");
            op = leer.next();
        
            switch (op) {
                case "Cuadrado":
                System.out.println("Ingrese el valor del lado del cuadrado");
                lado = leer.nextFloat();

                //crear el objeto de la subclase cuadrado
                Cuadrado figura1 = new Cuadrado(lado);
                figura1.calcularArea();
                break;


                case "Rectangulo":
                System.out.println("Ingrese el valor de la base del rectangulo");
                base = leer.nextFloat();
                System.out.println("Ingrese el valor de la altura del rectangulo");
                altura = leer.nextFloat();

                //crear el objeto de la subclase rectangulo
                Rectangulo figura2 = new Rectangulo(base, altura);
                figura2.calcularArea();
                break;


                case "Circulo":
                System.out.println("Ingrese el valor del radio del circulo");
                radio = leer.nextFloat();

                //crear el objeto de la subclase circulo
                Circulo figura3 = new Circulo(radio);
                figura3.calcularArea();
                break;

                case "Triangulo":
                System.out.println("Ingrese el valor de la base del triangulo");
                base = leer.nextFloat();
                System.out.println("Ingrese el valor de la altura del triangulo");
                altura = leer.nextFloat();

                //crear el objeto de la subclase circulo
                Triangulo figura4 = new Triangulo(base, altura);
                figura4.calcularArea();
                break;

                default:
                System.out.println("La figura no esta en las opciones o la digito mal, recuerde que inicia con mayuscula y el resto es minusculas");
            }

        System.out.println("Desea consultar el area de otra figura? Si/No");
        deci = leer.next();
        } while (deci.equalsIgnoreCase("si"));


        leer.close();
    }
    
}
