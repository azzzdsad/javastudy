public class Study04 {
    public Study04() {

    }

    public static void main(String[] ar) {
    // void = 아웃풋해줄 값, 돌려줄 값은 X
        Study04 study = new Study04();
        // study = 참조 변수(래퍼런스 변수) / int = 본인의 값만 갖고 있음, 일반 자료
        // java는 자료가 2개가 있음, 참조 자료와 일반 자료
        // Study04는 힙에 있는 곳으로 감
        int a = 일의_값을_전달_받는_메소드();
        System.out.print(study);

    }

    public int int_value() {
        //public int 일의_값을_전달_받는_메소드() {
        return 1;
        //아웃풋. 값을 설정했을 때 돌려받는 값.

    }

    

}