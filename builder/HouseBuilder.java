package builder;

public abstract class HouseBuilder {
    //将产品组合过来
    //用protected；可以让同一个包下面的类以及子类与进行访问
    protected House house = new House();

    //地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWall();

    //盖顶
    public abstract void roofed();

    //盖房子；==>（房子盖好了）返回产品
    public House buildHouse() {
        return house;
    }
}
