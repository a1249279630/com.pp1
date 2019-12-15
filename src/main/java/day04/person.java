package day04;

import java.util.HashMap;
import java.util.Map;

public class person {

    private String name;


    private String sex;


    private Integer age;


    private int hight;


    private Long weight;


    //   姓名
    Map<String, person> map=new HashMap<String, person>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                ", weight=" + weight +
                '}';
    }

}
