package Juego;

public class Ejecucion {

    public static void main(String[] args) {
        
        Carisellazo juego1 = new Carisellazo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        Piedrapapeltijera juego2 = new Piedrapapeltijera();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();

    }
    
}
