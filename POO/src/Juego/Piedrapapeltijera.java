package Juego;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego{

    //atributos
    private int maquina, op; 
    private String nombre; 

    //objeto scanner para capturar datos
    Scanner leer = new Scanner(System.in);


    //solicitar datos
    public void iniciar() {
        System.out.println("Bienvenido al juego de piedra papel y tijera");
        System.out.println("Ingrese el nombre del jugador");
        nombre = leer.next();
    }

    public void jugar() {
        System.out.println("Elija una opción: 1.tijeras 2.papel 3.piedra");
        op = leer.nextInt();
        Random juego = new Random();
        maquina = juego.nextInt(3)+1;
    }

    public void finalizar() {
        if (op==1 && maquina==2 || op==2 && maquina==3 || op==3 && maquina==1){
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" felicidades GANO");
        } else if (op==2 && maquina==1 || op==3 && maquina==2 || op==1 && maquina==3) {
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" lo lamento PERDIO");
        }
        if (op==maquina){
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" ninguno de los dos gana EMPATE");
        }
    }
    


}
