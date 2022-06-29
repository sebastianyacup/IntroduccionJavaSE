public class updatingVariables {
    public static void main(String[] args) {
        int salary= 1000;
        int resultado;
        // Bono $200
        resultado = salary+ 200;
        System.out.println(resultado);
        // Pension: $50 descuento
        resultado = salary + 200 - 50;
        System.out.println(resultado);
        // 2 horas extra $30 c/u
        // Comida: 45
        resultado = salary + 200 - 50 + 60 - 45;
        System.out.println(resultado);
        // Actulizando cadenas de texto
        String employeeName = " Anahi salgado ";
        employeeName = employeeName + " Diaz de la vega";
        System.out.println(employeeName);
        employeeName = "irene " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
