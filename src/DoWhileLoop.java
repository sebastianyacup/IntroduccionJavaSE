import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int valor_introducido= 3;
        do {
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. Peliculas");
            System.out.println("2. Series");
            System.out.println("3. Salir");
            Scanner sc = new Scanner(System.in);
            valor_introducido = Integer.valueOf(sc.nextLine());
            switch (valor_introducido){
                case 3:
                System.out.println("GRACIAS POR VISITARNOS");
                break;
                case 1:
                    System.out.println("Peliculas");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        }while (valor_introducido !=3);
        System.out.println("Se termino el problema");
    }
}
