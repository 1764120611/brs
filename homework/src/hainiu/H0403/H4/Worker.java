package hainiu.H0403.H4;

//定义一个Worker类（属性 姓名 年龄 工资salary）创建几个worker对象，存入TreeMap集合，
//要求按薪资从大到小排序，如果薪资相同，按照年龄从小到大；如果也相同，按姓名字典顺序排序。
public class Worker implements Comparable<Worker> {
    private String name;
    private int age;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        double result=o.getSalary()-this.getSalary();
        result=result==0?this.getAge()-o.getAge():result;
        result=result==0?this.getName().compareTo(o.getName()):result;
        return (int) result;
    }
}
