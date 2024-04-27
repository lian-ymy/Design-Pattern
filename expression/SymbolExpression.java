package expression;

import java.util.HashMap;

//抽象运算符号解析器，这里每个运算符号都只和自己左右两个数字有关系
public abstract class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //让其子类来实现
    public abstract int interpret(HashMap<String, Integer> var);
}
