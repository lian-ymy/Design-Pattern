package visitor;

import java.util.ArrayList;

public class Computer implements ComputerPart {
    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Monitor(),new KeyBoard(),new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < 3; i++) {
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
