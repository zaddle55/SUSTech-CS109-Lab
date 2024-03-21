public class Swap {
    public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5}; 
    swap(a, 2, 3);  
    }
    static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
