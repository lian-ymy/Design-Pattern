package iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    private Department[] departments;
    //记录数组的对象数
    int cnt=3;

    public ComputerCollege() {
        departments = new Department[10];
        departments[0]=new Department("计科","计算机科学与技术");
        departments[1]=new Department("软工","软件工程");
        departments[2]=new Department("大数据","大数据科学与技术");
    }

    @Override
    public String getCollegeName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[cnt++]=department;
    }

    @Override
    public Iterator getIterator() {
        return new ComputerIterator(departments);
    }
}
