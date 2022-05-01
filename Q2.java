import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // (a+b+c)*100/max/n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        // 개수만큼 입력
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        long sum=0;
        long max=0;
        // max 찾고, 요소 하나씩 더해 sum에 삽입
        for(int i=1;i<n;i++) {
            if (arr[i]>max) max = arr[i];
            sum += arr[i];
        }

        // 수식 전환
        System.out.println(sum*100/max/n);

    }

}

