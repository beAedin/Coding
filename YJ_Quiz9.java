package task;

public class YJ_Quiz9 {
    public static void main(String[] args) {
        // 9-1 : 문자열을 합침
        char value1[] = {'h','e','l','l','o'};
        char value2[] = {' ', 'w', 'o', 'r', 'l', 'd'};

        char values[] = concatenate(value1, value2);

        System.out.println(values);

        // 9-2 : 문자열 비교
        boolean result = compareTo(new String("문자열 1").toCharArray(), new String("문자열 2").toCharArray());
        System.out.println(result ? "같음" : "다름");

        // 9-3 : 문자열 위치 찾기
        int index = indexOf(new String("abcdefg").toCharArray(), new String("cde").toCharArray());
        System.out.println(index);

        // 9-4 : 문자열 치환
        char result4[] = replace(new String("abcdefg").toCharArray(), new String("cde").toCharArray(), new String("k").toCharArray());
        System.out.println(result4);
    }

    // 9-1 : 문자열을 합침
    public static char [] concatenate(char arg1[], char arg2[]) {
        char value1[] = arg1;
        char value2[] = arg2;
        // value1와 value2를 받아옴

        char sum[] = new char[value1.length+value2.length];
        // sum의 크기는 value1,2의 길이를 더한 것

        int j=0;
        // value2의 요소들을 sum에 더하기 위한 변수

        // for문 -> sum에 value1 넣기
        for(int i=0;i<sum.length;i++) {
            if(i >= value1.length) {
                sum[i] = value2[j];
                j++;
                continue;
            }
            sum[i] = value1[i];
        }
        return sum;
    }

    // 9-2 : 문자열 비교
    public static boolean compareTo(char arg1[], char arg2[]) {
        // arg1와 arg2 문자열 비교 후
        // 일치할 경우 "참", 아니면 "거짓"

        // 길이 != 문자열
        // return false
        if(arg1.length != arg2.length) return false;

        // for -> i에 위치한 요소가 다르면 false
        for(int i=0;i<arg1.length;i++) {
            char a = arg1[i];
            char b = arg2[i];
            if(a != b) {
                return false;
            }
        }

        // 모두 동일하면 true
        return true;
    }

    // 9-3 : 문자열 위치 찾기
    public static int indexOf(char arg1[], char arg2[]) {
        int cnt = 0;
        int idx = 0;

        // 검색 대상의 길이만큼
        // index 길이
        for(int i=0;i<arg1.length;i++) {
            // 같으면
            if(arg1[i] == arg2[cnt]) {
                cnt++;
                if(idx==0) idx = i;
                // cnt값이 arg2의 length와 같으면 다 찾은 것
                if(cnt == arg2.length) {
                    return idx;
                }
            } else {
                if(cnt != 0) {
                    return -1;
                }
            }

        }
        return -1;
    }

    // 9-4 : 문자열 치환
    public static char[] replace(char arg1[], char arg2[], char arg3[]) {

        int cnt = 0;
        int idx = 0;

        // 검색 대상의 길이만큼
        // index 길이
        for(int i=0;i<arg1.length;i++) {
            // 같으면
            if(arg1[i] == arg2[cnt]) {
                cnt++;
                if(idx==0) idx = i;
                // cnt값이 arg2의 length와 같으면 다 찾은 것
                if(cnt == arg2.length) {
                    break;
                }
            }
        }

        System.out.println("index는 어디죠? " + idx);
        char[] result = new char[arg1.length-arg2.length+arg3.length];

        // 1. 앞의 것을 result에 삽입
        for(int i=0;i<idx;i++) {
            result[i] = arg1[i];
        }

        // 2. 치환값 삽입
        int j=0;
        int tmp=0;
        // i = idx
        // 치환값 길이 + 인덱스 위치 -> 해당 범위 까지 for문
        for(int i=idx;i<arg3.length+idx;i++) {
            result[i] = arg3[j];
            j++;
            tmp=i+1;
            // if(i==arg3.length-1) tmp=i;
        }

        // 3. 나머지 값 삽입
        // arg1.length-arg2.length+arg3.length
        int nn = 0;

        System.out.println(tmp);
        for(int i=tmp;i<result.length;i++) {
            result[tmp] = arg1[tmp+idx];
            tmp++;
        }


        return result;
    }
}
