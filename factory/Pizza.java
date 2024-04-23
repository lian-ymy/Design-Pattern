package factory;

public abstract class Pizza {
    String name;

    public void make() {
        System.out.println("披萨制作中！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
