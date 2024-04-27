package expression;

import java.util.HashMap;

//变量解释器
public class VarExpression extends Expression{
    private String key;  //key = a,b

    public VarExpression(String key) {
        this.key = key;
    }

    //根据变量名称返回对应值
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
