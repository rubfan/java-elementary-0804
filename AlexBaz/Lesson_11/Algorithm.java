public class Algorithm {
//    2) Определите сложность следующего алгоритма:
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        System.out.println("The result is " + k + ", n = " + n);
        if (k <= n*n) {
            System.out.println("Algorithm Complexity O(n^2");
        }
        else if (k == n*n*n) {
            System.out.println("Algorithm Complexity O(n^3");
        }
        else {
            System.out.println("Algorithm Complexity from O(n^2) before O(n^3)");
        }
    }

}


