package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutputCollege {
    private List<College> colleges;

    public OutputCollege() {
        colleges = new ArrayList<College>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoManagerCollege());
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }

    //打印学院以及下面对应的院系
    public void getCollegeAllDepartment() {
        for (College college : colleges) {
            //获取到学院
            System.out.println("-----" + college.getCollegeName() + "-----");
            //获取学院的迭代器
            //计算机学院用的数组存储，信息学院用list存储，通过迭代器可以统一获取
            Iterator collegeIterator = (Iterator) college.getIterator();
            while (collegeIterator.hasNext()) {
                //获取到院系
                Department department = (Department) collegeIterator.next();
                System.out.println(department.getName() + " : " + department.getDescription());
            }
        }
    }
}
