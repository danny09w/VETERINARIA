//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //PARA QUE EL USUARIO PUEDA ESCRIBIR
    Scanner teclado = new Scanner(System.in);
    //CREAR OBJETO DESDE EL CONSTRUCTOR CON PARAMETROS
    Mascota masc1 = new Mascota("ZEUS", "PERRO", 5, 4.3);

    int opc;
    do {
        System.out.println("\n***BIENVENIDO***\n");
        System.out.println("MONITOREA A TU MASCOTA DESDE NUESTRO MENU:\n ELIGE UNA OPCION: ");
        System.out.println("\n1. VACUNAR");
        System.out.println("\n2. ALIMENTAR");
        System.out.println("\n3.CUMPLE AÑOS");
        System.out.println("\n4. SALIR");
        opc=teclado.nextInt();

        //SWITCH CASE
        switch (opc){
            case 1:
                masc1.vacunar();
                break;
            case 2:
                System.out.println("INGRESE CUANTO ALIMENTO LE VA A DAR: ");
                double comida = teclado.nextDouble();
                masc1.alimentar(comida);
            case 3:
                masc1.cumpleA();
                break;
            case 4:
                System.out.println("***GRACIAS POR PREFERIR NUESTROS SERVICIOS***");
            default:
                System.out.println("***LO SENTIMOS, LA OPCION NO ES VALIDA***");
        }

    }while (opc !=4);
    teclado.close();
}
