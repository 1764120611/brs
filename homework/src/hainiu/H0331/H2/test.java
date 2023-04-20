package hainiu.H0331.H2;

public class test {
    public static void main(String[] args) {
        Fox aLi = new Fox("阿狸","白色",320,"银白色");
        aLi.eat();
        aLi.getEyeColour();
        aLi.drink();
        rabbit r = new rabbit();
        r.setName("蛋黄");
        r.setAge(7);
        r.setColour("黑色");
        r.drink();
        r.toString();
        r.eat();
    }
}
