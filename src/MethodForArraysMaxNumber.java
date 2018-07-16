public class MethodForArraysMaxNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 8, 4, 5, 6, 8, 9, 0, 1};
        System.out.println("the biggest number is  " + biggestNum(arr));

    }

    static int biggestNum(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}