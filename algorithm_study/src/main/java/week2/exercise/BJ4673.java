package week2.exercise;

public class BJ4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];	// 1부터 10000이므로

        for (int i = 1; i < 10001; i++){
            int num = isSelfNumber(i);          // i에 각 자리 수 더해서 num에 대입

            if(num < 10001){	                // 10000 이 넘는 수는 필요 X
                check[num] = true;              // num 자리 true로 변경
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {	                // false 인 인덱스만 출력(false라는 건 셀프넘버라는 것)
                sb.append(i).append('\n');      // StringBuilder에 숫자 추가하고 한줄 띄우기
            }
        }
        System.out.println(sb);
    }

    public static int isSelfNumber(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10);         // 일의 자리 더해줌
            number = number/10;	               // 10을 나누어 일의 자리 제거
        }

        return sum;
    }
}
