package template;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * 模板方法类，其中有固定的模板方法不可以被改变
 * 也有其他子类可以共同使用方法
 */
public abstract class AbstractSoyaMilk {
    //模板方法，做豆浆使用的一套模板
    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    public void select() {
        System.out.println("挑选原料");
    }

    //由于该方法各个子类中实现不同，这里定义为抽象方法
    public abstract void addCondiments();

    public void soak() {
        System.out.println("浸泡原料");
    }

    public void beat() {
        System.out.println("豆浆机打碎");
    }
}
