package prototype;

public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    public Sheep sheep; //是对象，克隆是会如何处理，默认是浅拷贝

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    protected Sheep clone(){
        Sheep sheep1 = null;
        try {
            sheep1 = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep1;
    }
}
