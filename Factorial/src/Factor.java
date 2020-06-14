public class Factor {
    int factR(int n) {
        int result;
        if (n == l) return 1;
        result = factR(n - 1) * n;
        return result;
    }
}