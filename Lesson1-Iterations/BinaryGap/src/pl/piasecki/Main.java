package pl.piasecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution(529));
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int actualBinaryGap = 0;
        int longestBinaryGap = 0;
        for (int i=0; i<binary.length(); i++){
            if (binary.charAt(i) == '1'){
                if (longestBinaryGap < actualBinaryGap){
                    longestBinaryGap = actualBinaryGap;
                }
                actualBinaryGap = 0;
            } else {
                actualBinaryGap++;
            }
        }
        return longestBinaryGap;
    }
}
