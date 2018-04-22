package pl.piasecki;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        for (int i=0; i<K; i++){
            for (int k=0;k<A.length; k++){
                B[k] = A[k];
            }
            for (int j=0; j<A.length; j++){
                if (j == A.length-1){
                    A[0] = B[B.length-1];
                } else {
                    A[j+1] = B[j];
                }
            }
        }
        return A;
    }
}
