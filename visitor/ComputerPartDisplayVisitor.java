package visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("展示键盘");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("展示鼠标");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("展示显示屏");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("展示主机");
    }
}
