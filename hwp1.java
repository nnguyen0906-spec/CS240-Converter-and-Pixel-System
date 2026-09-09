// 1. Build an ASCII-to-decimal converter.


public class hwp1 {
    public static void main(String[] args) {
        String s = "hello";
        for (char c : s.toCharArray()) {
            System.out.println((int) c);
        }
    }
}