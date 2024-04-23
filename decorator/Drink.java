package decorator;

public abstract class Drink {
    //对饮品的描述
    private String description;
    //饮品价格
    private float price;

    //计算价格，由子类实现
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
