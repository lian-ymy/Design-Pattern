package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoManagerIterator implements Iterator {
    private List<Department> list = new ArrayList<Department>();
    private int index=0;

    public InfoManagerIterator(List<Department> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if(index>=list.size()||list.get(index)==null) {
            return false;
        }
        return true;
    }

    public Object next() {
        return list.get(index++);
    }

    public void remove() {

    }
}
