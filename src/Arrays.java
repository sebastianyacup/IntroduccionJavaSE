public class Arrays {
    public static void main(String[] args) {
        String[] androidVersiones  = new String[17];
        String days[]= new String[7];

        String[][] Ciuedades = new String[4][2]; // 4 * 2= 8

        int [][][]numeros=new int[2][2][2];
        int [][][][]numeros4=new int[4][3][2][3];


        androidVersiones[0] = "Apple Pie";
        androidVersiones[1] = "Bannana Bread";
        androidVersiones[2] = "Cupcake";
        androidVersiones[3] = "Donut";

        for (int i = 0; i < androidVersiones.length; i++) {
            System.out.println(androidVersiones[i]);
        }

        /*System.out.println(androidVersiones[0]);
        System.out.println(androidVersiones[1]);
        System.out.println(androidVersiones[2]);
        System.out.println(androidVersiones[3]);
*/


        System.out.println();
        System.out.println();

        Ciuedades[0][0] = "Colombia";
        Ciuedades[0][1] = "Medellin";
        Ciuedades[1][0] = "Argentina";
        Ciuedades[1][1] = "Brasil";
        Ciuedades[2][0] = "Paraguay";
        Ciuedades[2][1] = "Uruguay";
        Ciuedades[3][0] = "Bolivia";
        Ciuedades[3][1] = "Peru";

        for (int i = 0; i < Ciuedades.length; i++) {
            for (int j = 0; j < Ciuedades[i].length; j++) {
                System.out.println(Ciuedades[i][j]);

            }

        }
       /*
        System.out.println(Ciuedades[0][0]);
        System.out.println(Ciuedades[0][1]);
        System.out.println(Ciuedades[1][0]);
        System.out.println(Ciuedades[1][1]);
        System.out.println(Ciuedades[2][1]);
*/
    }
}
