public class q02 {
    //2번 문제 


    //정답지

    public static void main(String[] args) {
        String a = "자바";
        String b = new String("자바");
        
        if (a.equals(b)) {
            System.out.print("참"); // 문자열 내용이 같으므로 "참" 출력
        } else {
            System.out.print("거짓");
        }
    }

            /*
            String a = "자바";
            String b = new String("자바");
                if(a == b) {
                System.out.print("참");
                } else {
            System.out.print("거짓");
             * a와 b는 같은 내용("자바")을 가지지만, 문자열을 생성한 방법이 다릅니다.
                String a = "자바";는 문자열 상수를 String Pool에 저장합니다.
                String b = new String("자바");는 새로운 객체를 생성하여 Heap 메모리에 저장합니다.
                결과적으로 a와 b는 다른 메모리 위치를 참조하므로, == 연산의 결과는 **false**입니다.
             * 
             */

             //정답지

             
}
