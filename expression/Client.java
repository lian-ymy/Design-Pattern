package expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        //获得表达式
        String expStr = getExpStr();
        //去掉空格
        String str = expStr.replaceAll(" ", "");
        //获得值映射
        HashMap<String,Integer> map = getValue(str);
        Caculator caculator = new Caculator(str);
        //得到计算结果
        int result = caculator.run(map);
        System.out.println(expStr+" = "+result);
    }

    //获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式的值：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    //获得值映射
    public static HashMap<String,Integer> getValue(String expstr) throws IOException {
        HashMap<String,Integer> hashMap = new HashMap();
        for(char ch: expstr.toCharArray()) {
            if(ch!='+'&&ch!='-') {
                if(!hashMap.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + String.valueOf(ch)+"的值：");
                    String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    hashMap.put(String.valueOf(ch),Integer.valueOf(line));
                }
            }
        }
        return hashMap;
    }
}
