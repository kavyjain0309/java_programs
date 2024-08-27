public class Eucledian_GCD {
    public static int Gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = Gcd(6,27);
        System.out.println(n);
        System.out.println("This is the gcd");
    }
}
