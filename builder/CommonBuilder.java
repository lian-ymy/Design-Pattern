package builder;

public class CommonBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房盖顶");
    }
}
