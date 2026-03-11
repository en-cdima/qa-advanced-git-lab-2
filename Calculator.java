public class Calculator {
	private static final int BONUS = 5;
    // Calculeaza suma a doua numere
    public int aduna(int a, int b) {
        // Temporar, adunam si un bonus
        return a + b + BONUS;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Rezultat: " + calc.aduna(5, 10));
    }
}
