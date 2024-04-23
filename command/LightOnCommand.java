package command;

/**
 * 调用接收者命令
 * 聚合要调用对象，进行相应指令处理
 */
public class LightOnCommand implements Command{
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
