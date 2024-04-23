package template.hangermethod;

public class PureSoyaMilk extends AbstractSoyaMilk{

    @Override
    public void addCondiments() {}

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
