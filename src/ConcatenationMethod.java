public class ConcatenationMethod {
    public static void main(String[] args) {
        String s = "Sum";
        int a = 2;
        double d = 2.5;
        concatenation(a,d,s);

    }
    static void concatenation (int a, double d, String s){
        double sum = a+d;
        System.out.println(sum + " " + s);

    }
}
