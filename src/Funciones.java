import javax.management.MXBean;
/*
* Linea 1
* Linea 2
* Linea 3
* */
public class Funciones {
    public static void main(String[] args) {
        double y= 3;
        //Area de un circulo
        //P1 * R2
        double area = cicleArea(y);
        System.out.println(area);
        //Area de una esfera
        // 4 * PI*r2
        double Area_esfera = esferaArea(y);
        System.out.println(Area_esfera);
        // Volumen de una esfera
        // (4/3)*PI * r3
        double volumen_esfera = Volumen_de_Esfera(y);
        System.out.println(volumen_esfera);
        System.out.println("PESOS A DOLARES " + ConverToDolar(1000, "COP"));
    }
    public static double cicleArea(double r){
        return Math.PI* Math.pow(r,2);
    }
    public static double esferaArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public  static  double Volumen_de_Esfera(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripción: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     *@param cantidad Cantidad del dinero
     *@param moneda Tipo de Moneda: Solo acepta MXN o COP
     *@return cantidad  Devuelve la cantidad actulizada en dolares
     * */
    public  static double ConverToDolar(double cantidad, String moneda){
     // MXN COP
     switch (moneda){
         case "MXN":
             cantidad = cantidad * 0.052;
             break;
         case "COP":
             cantidad = cantidad * 0.00031;
             break;
     }
     return cantidad;
    }
}
