public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "amarillo";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark");
                break;
            default:
                System.out.println("Selecciona una opcion valida");


        }
    }
}
