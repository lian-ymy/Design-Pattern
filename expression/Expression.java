package expression;

import java.util.HashMap;

public abstract class Expression {
    /**
     * 根据变量名称，返回对应值
     */
    public abstract int interpret(HashMap<String,Integer>var);
}
