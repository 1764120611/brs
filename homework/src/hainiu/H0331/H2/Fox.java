package hainiu.H0331.H2;

public class Fox extends Pet {
    private String eyeColour;

    public Fox() {
    }

    public Fox(String name, String colour, int age, String eyeColour) {
        super(name, colour, age);
        this.eyeColour = eyeColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    @Override
    public void eat() {
        System.out.println("小狐狸一般吃肉捏");
    }

}
