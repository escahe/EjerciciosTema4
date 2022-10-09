public class App {
    public static void main(String[] args) {
        System.out.println("\n IF:");
        int numeroIf = 0;
        ejercicioIf(numeroIf);

        System.out.println("\n WHILE:");
        int numeroWhile = 0;
        ejercicioWhile(numeroWhile);

        System.out.println("\n DO WHILE:");
        ejercicioDoWhile(numeroWhile);

        System.out.println("\n FOR:");
        ejercicioFor();

        System.out.println("\n SWITCH:");
        String estaciones [] =  {"Verano","INVIERNO","Otoño","PRImavera","OpenBootcamp"};
        for (String estacion : estaciones) {
            ejercicioSwitch(estacion);
        }
    }
    //Función para verificar si un número es positivo, negativo o cero:
    public static void ejercicioIf(int numero){
        if (numero < 0){
            System.out.println("negativo");
        }else if (numero > 0){
            System.out.println("positivo");
        }else{
            System.out.println("cero");
        }
    }
    //Función ciclo while
    public static void ejercicioWhile(int numero){
        while (numero < 3){
            numero++;
            System.out.println(numero);
        }
    }
    //Función Do While
    public static void ejercicioDoWhile(int numero){
        do {
            numero++;
            System.out.println(numero);
            break;
        } while (numero < 3);
    }
    //Función bucle for
    public static void ejercicioFor(){
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
    }
    //Función switch
    public static void ejercicioSwitch(String estacion){
        switch (estacion.toLowerCase()) {
            case "invierno":
                System.out.println("En invierno hace frio");
                break;
            case "verano":
                System.out.println("En verano hace calor");
                break;
            case "otoño":
                System.out.println("En otoño las hojas cambian");
                break;
            case "primavera":
                System.out.println("En primavera todo florece");
                break;
            default:
                System.out.println(estacion + ", no es una estación.");
                break;
        }
    }

}
