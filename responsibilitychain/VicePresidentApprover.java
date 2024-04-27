package responsibilitychain;

public class VicePresidentApprover extends Approver {
    public VicePresidentApprover(String name) {
        super(name);
    }

    @Override
    public void HandlingTheRequest(SchoolRequest schoolRequest) {
        if (schoolRequest.getPrice() > 10000 && schoolRequest.getPrice() <= 20000) {
            System.out.println(this.name + "能处理这个项目" + schoolRequest.getType());
            System.out.println("项目Id为" + schoolRequest.getId());
        } else {
            System.out.println(this.name + "表示不行，去找校长");
            approver.HandlingTheRequest(schoolRequest);
        }
    }
}
