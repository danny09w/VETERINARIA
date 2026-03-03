//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //PARA QUE EL USUARIO PUEDA ESCRIBIR
    Scanner teclado = new Scanner(System.in);
    //LISTA
    List<Mascota> lstMascota = new ArrayList<>();
    //VARIABLES INICIALIZADAS
    int opc;
    //CREAR LISTA
    do {
        System.out.println("""
                1. CREAR OBJETO
                2. MOSTRAR TODO
                3. BUSCAR POR NOMBRE """);
        //INICIALIZO LA OPC
        opc = teclado.nextInt();
        //SWITCH CASE
        switch (opc) {
            case 1:
                System.out.println("CREAR OBJETO: ");
                System.out.println("INGRESA EL NOMBRE DE TU MASCOTA: \n");
                String nombre = teclado.next();
                System.out.println("INGRESA LA ESPECIE DE TU MASCOTA: \n");
                String especie = teclado.next();
                System.out.println("INGRESA LA EDAD DE TU MASCOTA: \n");
                int edad = teclado.nextInt();
                System.out.println("INGRESA EL PESO DE TU MASCOTA: \n");
                double peso = teclado.nextDouble();

                Mascota m = new Mascota(nombre, especie, edad, peso);
                lstMascota.add(m);
                break;
            case 2:
                System.out.println(lstMascota);
                break;
            case 3:
                String nomMascota;
                System.out.println("""
                         ****BUSCAR MASCOTA****
                        ***POR FAVOR INGRESA EL NOMBRE DE TU MASCOTA*** """);
                nomMascota = teclado.next();
                for (Mascota m2 : lstMascota) {
                    if (m2.getNombre().equalsIgnoreCase(nomMascota)) {
                        System.out.println(m2);

                    }
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
                                m2.vacunar();
                                System.out.println(m2.toString());
                                break;
                            case 2:
                                System.out.println("INGRESE CUANTO ALIMENTO LE VA A DAR: ");
                                double comida = teclado.nextDouble();
                                m2.alimentar(comida);
                                System.out.println(m2.toString());
                            case 3:
                                m2.cumpleA();
                                System.out.println(m2.toString());
                                break;
                            case 4:
                                System.out.println("***GRACIAS POR PREFERIR NUESTROS SERVICIOS***");
                                System.out.println(m2.toString());
                            default:
                                System.out.println("***LO SENTIMOS, LA OPCION NO ES VALIDA***");
                        }

                    }while (opc !=4);
                }
                break;
        }
    }while (opc != 4) ;


        //DO-WHILE
  /*  */

    }

