import java.util.Scanner;

public class Mascota {
    //ATRIBUTOS
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    //CONSTRUCTOR VACIO

    public Mascota() {

    }
    //CONSTRUCTOR CON PARAMETROS


    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = false;
    }

    //GET-SET


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    //METODO TO STRING

    @Override
    public String toString() {
        return "Mascota" +
                "nombre='" + nombre + "\n" +
                ", especie='" + especie + "\n" +
                ", edad='" + edad +"\n"+
                ", peso=" + peso +"\n"+
                ", vacunado=" + vacunado +"\n";
    }
    //METODOS PROPIOS
    public void vacunar(){
        this.vacunado = true;
        System.out.println("***TU MASCOTA YA CUENTA CON SU VACUNA***");
    }
    public void alimentar(double cantidad){
        if (cantidad>0){
            this.peso+=cantidad;
            System.out.println("***¡FELICIDADES! TU MASCOTA AH SUBIDO DE PESO. AHORA PESA: "+this.peso);
        }else {
            System.out.println("***LO SENTIMOS, LA CANTIDAD QUE INGRESASTE NO ES VALIDA***");
        }
    }
    public void cumpleA(){
        this.edad++;
        System.out.println("***TU MASCOTA AHORA TIENE: "+this.edad+" AÑOS");
    }
   //mostrar
   public void mostrar() {
       String estado = vacunado ? "Sí" : "No";
       System.out.println("\n***Ficha de la Mascota***");
       System.out.println("Nombre: " + nombre);
       System.out.println("Especie: " + especie);
       System.out.println("Edad: " + edad + " años");
       System.out.println("Peso: " + peso + " kg");
       System.out.println("Vacunado: " + estado);
       System.out.println("*******************");
   }
}
