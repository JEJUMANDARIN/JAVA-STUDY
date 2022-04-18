// Java 프로그래밍 - 변수와 자료형_3

public class practice_03 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "GYURI";
        System.out.println("s1 = " + s1);
        String s2 = "19920405";
        System.out.println("s2 = " + s2);

//      1-1. equals
        String s3 = "HI";
        String s4 = "HI";
        System.out.println(s3.equals((s4))); // 두가지 데이터 비교하기
        System.out.println(s3 == s4);
        String s5 = new String("HI");   //새로운 데이터 생성
        System.out.println(s3.equals(s5));  //변수가 같고 있는 값을 비교
        System.out.println(s3 == s5);   //객체를 비교한다


//      1-2. indexOf
        // 특정 문자열 찾아주는 메서드
        String s6 = "GYURI! WORLD!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));



//      1-3. replace
        String s7 = s6.replace("GYURI", "SUBIN");
        System.out.println("s7 = " + s7);

//      1-4. substring


//      1-5. toUpperCase



//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");



//      3. 자료형 - 배열
        System.out.println("== 배열 ==");


    }
}


