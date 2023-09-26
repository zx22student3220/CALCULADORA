public class CalculadoraSuma {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        
        int resultado = sumar(num1, num2);
        
        System.out.println("La suma es: " + resultado);
    }
}
