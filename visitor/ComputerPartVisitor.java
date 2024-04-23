package visitor;

import java.security.Key;

/**
 * 表示访问者的接口
 */
public interface ComputerPartVisitor {
    public void visit(KeyBoard keyBoard);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
    public void visit(Computer computer);
}
