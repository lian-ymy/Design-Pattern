package command;

import flyweight.ConcreteWebSite;

public class RemoteController {
    //打开按钮命令组
    Command[] onCommands;
    //关闭按钮命令组
    Command[] offCommands;
    //撤销按钮命令
    Command undoCommand;
    //初始化为空命令组
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }
    //设置命令
    public void setCommand(int no,Command onCommand,Command offCommand) {
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }
    //执行命令
    public void ExecuteCommand(int no) {
        onCommands[no].execute();
        undoCommand = offCommands[no];
    }
    //关闭命令
    public void CloseCommand(int no) {
        offCommands[no].execute();
        undoCommand = onCommands[no];
    }
    //撤销命令
    public void UndoCommand() {
        undoCommand.execute();
    }
}
