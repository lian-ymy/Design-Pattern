package composite;

public abstract class OrganizationComponent {
    private String name;
    //描述
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //输出打印方法，大学，学院，院系都需要的，作为抽象方法
    protected abstract void print();

    //由于叶子节点可能不需要某些方法，所以就没用抽象方法，比如院系就不需要实现这个方法
    //添加方法
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    //删除方法
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }
}
