public class Ejercicio2 {
    public static void main(String[] args) {
        // pasar de char c  a int
        char c = 'z';
        int d = c;
        System.out.println("El valor de  pasar a int es: " + d);
        // Pasar long y luego de long a short
        int i =250;
        long v= i;
        short J = (short)v;
        System.out.println("El valor de pasar a short es " + J);
        // Pasar de double  a long
        double x= 301.067;
        long z= (long)x;
        System.out.println("El valor de pasar de double a long es: " + z);
        // Sumarle al int 5000.66 y convertirlo en float
        int k = 100;
        float Q = k + 5000.66F;
        System.out.println("El resultado es: " + Q);
        // Mutiplicar el int por 100 y conviertelo a byte
        int I = 737;
        int M= I * 100;
        byte ResultadoM = (byte)M;
        System.out.println("el resultado de la operacion es: " + ResultadoM);
        // Dividir entre 25 y convertirlo a long
        double D=298.638;
        double K= D / 25;
        long  ResultadoK = (long)K;
        System.out.println("El resultado de la conversion es " + ResultadoK);


    }
}
