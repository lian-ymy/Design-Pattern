package prototype;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("懒洋洋", 18);
        sheep.setSheep(new Sheep("喜羊羊",12));

        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();

        System.out.println("sheep1的hashcode为"+sheep1.hashCode()+"sheep1的朋友的hashcode为："+sheep1.getSheep().hashCode());
        System.out.println("sheep2的hashcode为"+sheep1.hashCode()+"sheep2的朋友的hashcode为："+sheep1.getSheep().hashCode());
        System.out.println("sheep3的hashcode为"+sheep1.hashCode()+"sheep3的朋友的hashcode为："+sheep1.getSheep().hashCode());
        System.out.println("sheep4的hashcode为"+sheep1.hashCode()+"sheep4的朋友的hashcode为："+sheep1.getSheep().hashCode());
    }
}
