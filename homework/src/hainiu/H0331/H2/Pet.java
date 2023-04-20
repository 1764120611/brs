package hainiu.H0331.H2;

public abstract class Pet {
    private String name;
    private String colour;
    private int age;

    public void drink(){
        System.out.println("颜色是"+colour+"的宠物"+name+"渴了，它今年"+age+"岁了");
    }
    public abstract void eat();

    public Pet() {
    }

    public Pet(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
