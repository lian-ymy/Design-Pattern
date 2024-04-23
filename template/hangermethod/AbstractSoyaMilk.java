package template.hangermethod;

/**
 * 钩子模板方法：可以实现除了特定操作外
 * 用来执行有关其他的操作
 */
public abstract class AbstractSoyaMilk {
    //模板方法，做豆浆使用的一套模板
    public final void make() {
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
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

    //定义钩子方法，默认返回true
    public boolean customerWantCondiments() {
        return true;
    }
}
