public class Casting {
    public static void main(String[] args) {
        //En un año  ubicar 30 perros
        // Cuantos perros ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
        // Estimacion
        int dogs = (int)monthlyDogs;
        System.out.println(dogs);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        double exactitud= (double) a/b;
        System.out.println(exactitud);
        double c = a/b; // Automatico pero sin exactitud
        System.out.println(c);
        char n = '1';
        int nI = n;
        System.out.println(nI);
        short nS= (short)n;
        System.out.println(nS);


    }
}
