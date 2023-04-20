package hainiu.H0410.enumDemo;

public class ModeTest {
    private Mode mode;
    public ModeTest(Mode mode){
        this.mode=mode;
    }
    public static void main(String[] args) {
        ModeTest test=new ModeTest(Mode.PERFORMANCE);
        test.test();
    }

    private void test() {
        switch (mode){
            case NORMAL:
                System.out.println("普通模式");
                break;
            case ENERGY_SAVING:
                System.out.println("节能模式");
                break;
            case PERFORMANCE:
                System.out.println("性能模式");
                break;
            case FLIGHT:
                System.out.println("飞行模式");
                break;
        }
    }
}
