/* 
substring() 을 사용해서, hello 부분과 .txt 부분을 분리해라.
단순하게 substring() 에 숫자를 직접 입력해서 문제를 풀면 된다.
*/

package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        
        System.out.println("filename = " + str.substring(0, 5));
        System.out.println("extName = " + str.substring(5));
    }
}