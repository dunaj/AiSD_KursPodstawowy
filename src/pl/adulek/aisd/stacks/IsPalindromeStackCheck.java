package pl.adulek.aisd.stacks;

public class IsPalindromeStackCheck {

    public static void main(String[] args) {
        String Idid = "I did, did I";
        String racecar = "   Racecar";
        String hello = "hello  ";

        System.out.println(isPalindrome(Idid));
        System.out.println(isPalindrome(racecar));
        System.out.println(isPalindrome(hello));
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String s) {
        ArrayStack<Character> stack = new ArrayStack<>(s.length());
        String normalized = s.toLowerCase();
        normalized = normalized.replaceAll("[\\W]","");
        normalized = normalized.replaceAll("[_]","");
        for(int i = 0; i < normalized.length(); ++i) {
            stack.push(normalized.charAt(i));
        }
        StringBuilder stringToCompare = new StringBuilder();
        while (!stack.isEmpty()) {
            stringToCompare.append(stack.pop());
        }
        //System.out.println(normalized + "   " + stringToCompare);
        return stringToCompare.toString().equals(normalized);
    }
}
