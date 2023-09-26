public class CalculadoraResta {
    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;
        
        int resultado = restar(num1, num2);
        
        System.out.println("La resta es: " + resultado);
    }
}
