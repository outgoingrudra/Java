public class Alphabet_hourglass {

    static char[] A = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    static void pattern(int v, int m) {
        if (v <= m) {
            System.out.print(A[v]);
            pattern(v + 1, m);
            if (v != m)
                System.out.print(A[v]);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int totalRows = 2 * n - 1;

        for (int i = 0; i < totalRows; i++) {
            int limit = (i < n) ? n - 1 - i : i - n + 1;
            int spaces = (i < n) ? 2 * i : 2 * (totalRows - 1 - i);

            System.out.print(" ".repeat(spaces));
            pattern(0, limit);
            System.out.println();
        }
    }
}
