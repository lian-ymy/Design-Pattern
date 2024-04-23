package adapter.objectAdapter;

public class Voltage220V {
    public int output() {
        int src = 220;
        System.out.println("电压"+220+"伏");
        return src;
    }
}
