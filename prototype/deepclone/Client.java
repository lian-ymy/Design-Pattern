package prototype.deepclone;

public class Client {
    public static void main(String[] args) {
        DeepClonePrototype p = new DeepClonePrototype();
        p.name = "镜流";
        p.deepCloneableTarget = new DeepCloneableTarget("ymy","YMY");

        //使用字符流方式完成深拷贝
        DeepClonePrototype p2 = (DeepClonePrototype) p.deepClone();

        System.out.println("p.name"+p.name+"p.depCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name"+p2.name+"p2.depCloneableTarget="+p2.deepCloneableTarget.hashCode());
    }
}
