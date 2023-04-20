package hainiu.H0331.H2;

public class rabbit extends Pet{
    @Override
    public void eat() {
        System.out.println("兔子一般吃胡萝卜捏");
    }

    public rabbit() {
    }

    public rabbit(String name, String colour, int age) {
        super(name, colour, age);
    }

}
