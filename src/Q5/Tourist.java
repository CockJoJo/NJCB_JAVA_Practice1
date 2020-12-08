package Q5;

public class Tourist {
    private String  name;
    private int age;
    public Tourist(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
