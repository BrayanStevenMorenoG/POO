package Principal;

import Salud.Persona;

public class Inicio {
    
    public static void main(String[] args) {
        
        //crear objeto
        Persona usuario = new Persona();

        //invocar metodo
        usuario.pedirDatos();
        usuario.mostrarPersona();
        usuario.mayorEdad();
        usuario.calcularImc();

    }
}
