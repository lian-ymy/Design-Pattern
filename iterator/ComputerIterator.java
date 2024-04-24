package iterator;

import java.util.Iterator;

public class ComputerIterator implements Iterator {
    //以数组方式存储-->系
    private Department[] departments;
    //下标位置
    int index=0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断后面是否还有元素
    @Override
    public boolean hasNext() {
        if(index < 0 || index>=departments.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }

    //删除方法，空实现
    public void remove() {

    }
}
