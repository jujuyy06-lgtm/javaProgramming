public class hello {
    public static int sum(int i, int j) {   //정수를 두개 받아 더한 값을 돌려주는 메서드 
        return i + j;   //매개변수 i와 j를 더해 돌려 받음 
    }
    public static void main(String[] args){     //main메서드로 프로그램이 처음 시작되는 부분 
        int i;      //변수 선언언(정수)
        int j;      //변수 선언언(정수)
        char a;     //변수 선언언(문자 하나)
        String b;       //변수 선언언(문자열)
        final int TEN = 10;     //TEN이라는 상수 선언 final이 붙어 있기에 나중에 값을 변경할 수 없음 
        i = 1;      //변수 i에 1저장
        j= sum (i, TEN);    //i는 1이고 TEN은 10 sum 메서드 실행되어 11저장 
        a = '?';        //a에 문자 ?를 저장 
        b = "Hello";        //b에 Hello 저장 
        java.lang.System.out.println(a);        //a값 출력 
        System.out.println(b);      //b값 출력 
        System.out.println(TEN);    //TEN값 출력 
        System.out.println(j);      //j값 출력 
    }
}