package adapter.interfaceAdapter;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void m1() {
                System.out.println("这里使用了m1方法");
            }
        };
        //这里的abstractAdapter的类型不是抽象类AbstractAdapter，而是它的子类
        abstractAdapter.m1();
        System.out.println(abstractAdapter.getClass());
        System.out.println(abstractAdapter.getClass().getSuperclass());
    }
}
