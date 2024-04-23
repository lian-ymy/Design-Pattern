package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学类，作为Composite管理学院College
 */
public class University extends OrganizationComponent{
    //这里存放的是学院
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
    }

    //添加方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //删除方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("======="+getName()+"========");
        for(OrganizationComponent organizationComponent: organizationComponents) {
            organizationComponent.print();
        }
    }
}
