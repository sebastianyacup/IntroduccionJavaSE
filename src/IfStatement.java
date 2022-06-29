public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int FileSended = 3;
        if (isBluetoothEnabled ) {
            // Send file
            FileSended++;
            System.out.println("Archivo enviado " + FileSended);
        } else {
            FileSended--;
            System.out.println("Por favor iniciar el Bluethooth, para iniciar la transferencia " + FileSended );
        }
    }
}
