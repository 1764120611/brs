package hainiu.H0328;

public class H9 {
    public static void main(String[] args) {
        int ge = 0;
        int shi = 0;
        int bai = 0;
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            bai = i;
            for (int j = 1; j <= 4; j++) {
                if (j != i) {
                    shi = j;
                }
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        ge = k;
                        count++;
                        System.out.println(bai * 100 + shi * 10 + ge);
                    }
                }
            }
        }
        System.out.println("共" + count + "个");
    }
}
