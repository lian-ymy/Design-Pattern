package command;

public class Client {
    public static void main(String[] args) {
        //电灯-->命令接收者
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //电视-->命令接收者
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        //遥控器
        RemoteController remoteController = new RemoteController();
        //分别设置期望的电视机与电灯指令
        remoteController.setCommand(0,lightOffCommand,lightOnCommand);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        //执行命令
        remoteController.ExecuteCommand(0);
        remoteController.ExecuteCommand(1);
        remoteController.CloseCommand(0);
        remoteController.UndoCommand();
    }
}
