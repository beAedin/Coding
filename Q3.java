import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        // BufferedReader : 큰 데이터를 받을 때 효과적
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer : 띄어쓰기 분해
        StringTokenizer stringTokenizer = new StringTokenizer(buffer.readLine());

        // stringTokenizer으로 구분한 것을
        // sN : 배열 크기
        // qN : 질문 개수
        int sN = Integer.parseInt(stringTokenizer.nextToken());
        int qN = Integer.parseInt(stringTokenizer.nextToken());

        // 배열 S
        long[] S = new long[sN + 1];

        stringTokenizer = new StringTokenizer(buffer.readLine());

        for(int i=1;i<=sN;i++) {
            // 합배열 만들기
            // S[i] = S[0] + S[1] + S[2] + ... + S[i-1] + S[i]
            // arr[i-1] + nextToken을 중첩해간다
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0;q<qN;q++) {
            stringTokenizer = new StringTokenizer(buffer.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            // 2번째거-(1번째거-1) = 부분값 구할 수 있음
            System.out.println(S[j]-S[i-1]);
        }
    }
}
