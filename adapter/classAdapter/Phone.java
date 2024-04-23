package adapter.classAdapter;

import adapter.objectAdapter.IVoltage5V;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V()==5) {
            System.out.println("充电成功！5V");
        } else {
            System.out.println("充电失败");
        }
    }
}
