package PrincipalReto3;

import SaludReto3.Empleado;
import SaludReto3.Persona;

public class Inicio {
    
    public static void main(String[] args) {
        
        //crear objetos
        Persona usuario = new Persona();
        
        //invocar los metodos
        usuario.pedirDatos();

        Empleado usuario2 = new Empleado();
        Empleado usuario3 = new Empleado(usuario.getTipoDoc(),usuario.getDocumento(), usuario.getNombre(), usuario.getApellido(), usuario2.getCargo(), usuario2.getHorasTrabajadas(), usuario2.getValorHora());
        
        usuario3.pedirEmpleado();
        usuario3.mostrarEmpleado();
        usuario3.calcularHonorarios();
        
}
}