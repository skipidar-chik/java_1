public class Main {
    public static void main(String[] args) {
        final float C = 2; // Константа C

        final float A = 1; // Початкове значення A
        final float N = 1; // Початкове значення N

        final float B = 6; // Кінцеве значення B
        final float M = 7; // Кінцеве значення M

        if (A > B || N > M) {
            System.out.println("Початкові значення не можуть бути більшими за кінцеві");
            return;
        }

        float S = 0;

        for (float i = A; i <= B; i++) {
            for (float j = N; j <= M; j++) {
                 S += (i + j) / (i / C);
            }
        }

        System.out.print("S = " + S); // Виведення результату
    }
}
