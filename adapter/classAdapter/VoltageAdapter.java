package adapter.classAdapter;

import adapter.objectAdapter.IVoltage5V;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    /**
     * 类适配器局限性：类适配器必须继承被适配者类，同时目标类必须是接口
     * @return
     */
    @Override
    public int output5V() {
        int src = output();
        int dst = src/44;
        return dst;
    }
}
