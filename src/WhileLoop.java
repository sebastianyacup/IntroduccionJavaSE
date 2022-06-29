public class WhileLoop {
    static boolean  prendidaLampara = false;
    public static void main(String[] args) {
        onlampara();
        int contador= 1;
        while (prendidaLampara && contador<=10) {
            System.out.println(contador + " SOS");
            printSos();
            contador++;
        }
        if (prendidaLampara== false ){
            todobien();
        }
    }
    public static void printSos(){
        System.out.println(" . . . _ _ _ . . .");
    }
    public static boolean onlampara(){
        prendidaLampara = (prendidaLampara)?true:false;
        return prendidaLampara;
    }
    public static void todobien(){
        System.out.println("Todo se encuentra bien");
    }
}
