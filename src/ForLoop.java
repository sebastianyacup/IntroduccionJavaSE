public class ForLoop {
    static boolean prendidaLampara = true;

    public static void main(String[] args) {
        if (prendidaLampara == true){
        onlampara();
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + " SOS ");
            printSos();
        }}
        if (prendidaLampara == false){
            todobien();

        }
    }


    public static void printSos() {
        System.out.println(" . . . _ _ _ . . .");
    }


    public static boolean onlampara() {
        prendidaLampara = (prendidaLampara) ? true : false;
        return prendidaLampara;
    }
    public static void todobien(){
        System.out.println("Todo se encuentra bien");
    }
}


