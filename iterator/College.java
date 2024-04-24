package iterator;

import java.util.Iterator;

public interface College {
    //获取学院名字
    public String getCollegeName();
    //添加院系
    public void addDepartment(Department department);
    //获取迭代器
    public Iterator getIterator();
}
