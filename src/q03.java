public class q03 {
    public static void main(String[] args) {

        /* 짝수 단만 출력하기
        for(int 단 = 1; 단 <= 9; 단++) {
            System.out.println(단 + "단");
            for(int i = 1; i <= 9; i++) {
                System.out.print(단 + " * " + i + " = " + (단 * i) + "\t" );
            }
            System.out.println();
        }
            */

        for (int 단 = 1; 단 <= 9; 단++) {
            // 짝수 단인지 확인
            if (단 % 2 == 0) {
                System.out.println(단 + "단");
                for (int i = 1; i <= 9; i++) {
                    System.out.print(단 + " * " + i + " = " + (단 * i) + "\t");
                }
                System.out.println();

                /*
                 * 단 % 2 == 0 조건 추가:

                단 % 2는 단을 2로 나눈 나머지를 의미합니다.
                결과가 0이면 짝수입니다.
                홀수 단(나머지가 1)은 출력되지 않습니다.
                단이 짝수일 때만 출력 코드가 실행됩니다.

                 */
            }
        }
        
    }
}
