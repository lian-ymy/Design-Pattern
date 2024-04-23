package adapter.classAdapter;

import adapter.classAdapter.Phone;
import adapter.classAdapter.VoltageAdapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
