package solutions.first_java;

public class IsPalindrome {
    private String str;
    public IsPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("str is null or empty");
        }
        this.str =str.toLowerCase();
    }

    public String getString() {
        return str;
    }

    public boolean isPalindrome() {
        int n = str.length();
        if (n == 1) return true;
        if (n == 0) return false;
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
