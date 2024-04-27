package expression;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Stack;

public class Caculator {
    //定义表达式
    private Expression expression;

    //构造函数传参并解析
    public Caculator(String expStr) {
        //通过栈来进行运算操作
        Stack<Expression> expressions = new Stack<>();
        //表达式拆分成字符数组
        char[] array = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        //遍历我们的字符数组，针对不同的情况做处理
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case '+':
                    left = expressions.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    expressions.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = expressions.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    expressions.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个var就创建VarExpression对象，并push到stack
                    expressions.push(new VarExpression(String.valueOf(array[i])));
            }
        }
        this.expression = expressions.pop();
    }

    public int run(HashMap<String,Integer> map) {
        return this.expression.interpret(map);
    }
}
