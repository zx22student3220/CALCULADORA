public class CalculadoraMultiplicacion {
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 7;
        
        int resultado = multiplicar(num1, num2);
        
        System.out.println("La multiplicación es: " + resultado);
    }
}
