package PrincipalReto2;

import SaludReto2.Persona;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        
        //crear objeto 
        Persona usuario = new Persona();
        double peso, estatura, IMC;
        Scanner leer = new Scanner(System.in);

        //invocar metodo
        usuario.pedirDatos();

    System.out.println("Digite su peso");
    peso = leer.nextDouble();
    System.out.println("Digite su estatura");
    estatura = leer.nextDouble();
    usuario.mostrarPersona();
    usuario.mayorEdad();
    IMC = usuario.calcularImc(peso, estatura);//dentro del parentesis van los argumentos
    System.out.println("Su IMC es: "+IMC);


    leer.close();
    }
    
}
