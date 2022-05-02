import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(buffer.readLine());

        int sN = Integer.parseInt(stringTokenizer.nextToken());
        int qN = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[sN + 1];

        stringTokenizer = new StringTokenizer(buffer.readLine());

        for(int i=1;i<=sN;i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0;q<qN;q++) {
            stringTokenizer = new StringTokenizer(buffer.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}
