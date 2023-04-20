package hainiu.H0401;

public class H12 {
    public static void main(String[] args) {
        String str = "asd09asdi9fajom0s9davj0a90sd;v/s[d;.[p3lf20[p.f[s";
        String result = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isCode(c)) {
                temp.append(c);
            } else {
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
                temp.delete(0, temp.length());
            }
        }
        if (isCode(str.charAt(str.length() - 1))) {
            if (temp.length() > result.length()) {
                result = temp.toString();
            }
        }
        System.out.println(result);
    }

    private static boolean isCode(char c) {
        return ((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c==32));
    }

}
