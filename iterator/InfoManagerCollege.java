package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoManagerCollege implements College{
    private List<Department>list;

    public InfoManagerCollege() {
        list = new ArrayList<Department>();
        list.add(new Department("马克思主义学院","弘扬马克思主义"));
        list.add(new Department("人文科学","学习先进思想"));
    }

    @Override
    public String getCollegeName() {
        return "信息管理学院";
    }

    @Override
    public void addDepartment(Department department) {
        list.add(department);
    }

    @Override
    public Iterator getIterator() {
        return new InfoManagerIterator(list);
    }
}
