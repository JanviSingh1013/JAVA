public class Primenumberrange {
    public static void main(String[] args) {
        int n = 40;
        boolean[] isprime = new boolean[n + 1];
        sieve (n, isprime);
    }
    static void sieve(int n, boolean [] isprime){
        for (int i = 2; i < n; i++) {
            if(!isprime[i]){
                for (int j = i * 2; j < n; j+=i) {
                    isprime[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isprime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
