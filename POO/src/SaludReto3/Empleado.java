package SaludReto3;

import java.util.Scanner;

public class Empleado extends Persona{
    
    //atributos de la clase empleado
    private String cargo, departamento;
    private int valorHora, horasTrabajadas;

    //metodo constructor vacio
    public Empleado(){

    }

    //metodo constructor con parametros
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, int horasTrabajadas, int valorHora){
    super(tipoDoc,documento,nombre,apellido);
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.cargo=cargo;
    }

    //metodos accesores
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Metodos de la clase
    public void pedirEmpleado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su cargo");
            cargo = leer.next();
            System.out.println("Digite el departamento");
            departamento = leer.next();
            System.out.println("Digite las horas trabajadas");
            horasTrabajadas = leer.nextInt();
            System.out.println("Digite el valor de las horas");
            valorHora = leer.nextInt();
    }

    public void mostrarEmpleado(){
        System.out.println("Su tipo de documento es: "+getTipoDoc());
        System.out.println("Su documento es: "+getDocumento());
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("Su apellido es: "+getApellido());
        System.out.println("Su cargo es: "+cargo);
        System.out.println("Sus horas trabajadas son: "+horasTrabajadas);
        System.out.println("El valor de sus horas son: "+valorHora);
    }

    public double calcularHonorarios(){
        double multi = (valorHora*horasTrabajadas);
        double Honorario = multi - (multi*0.966);
        System.out.println("El total a pagar es: "+Honorario);
        return Honorario;
    }


}
