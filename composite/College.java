package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院类，管理院系
 */
public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String description) {
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
        System.out.println("-------"+getName()+"-------");
        for(OrganizationComponent organizationComponent: organizationComponents) {
            organizationComponent.print();
        }
    }
}
