public class Main {
    public static void main(String[] args) {
        final float C = 2; // Константа C

        final float A = 1; // Початкове значення A
        final float N = 1; // Початкове значення N

        final float B = 7; // Кінцеве значення B
        final float M = 8; // Кінцеве значення M

        float S = 0;

        for (float i = A; i <= B; i++) {
            for (float j = N; j <= M; j++) {
                if (i != C) S += (i + j) / (i / C);
            }
        }

        System.out.print("S = " + S); // Виведення результату
    }
}