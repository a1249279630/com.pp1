package day04;

public class dog {

    private String name;

    private String color;

    private String call;

    private Integer age;

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", call='" + call + '\'' +
                ", age=" + age +
                ", bite=" + bite +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBite() {
        return bite;
    }

    public void setBite(Boolean bite) {
        this.bite = bite;
    }

    private Boolean bite;
}
