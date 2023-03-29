package Juego;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego{
    
    //atributos
    private int juego, op;
    private String nombre; 

    //objeto scanner para capturar datos
    Scanner leer = new Scanner(System.in);

    //solicitar datos
    public void iniciar(){
        System.out.println("Bienvenido al juego carisellazo");
        System.out.println("Ingrese el nombre del jugador");
        nombre = leer.next();
    }   

    public void jugar(){
        System.out.println("Elija una opción: 1.cara 2.sello");
        op = leer.nextInt();
        Random moneda = new Random();//objeto random para generar numero
        juego = moneda.nextInt(2)+1;
        System.out.println("Lanzo la moneda");
    }

    public void finalizar(){
        if (op==juego){
            System.out.println("Felicidades "+nombre+" GANO :D");
        } else {
            System.out.println("Lo lamento "+nombre+" no gano, mas suerte para la proxima :(");
        }
        }


    }
