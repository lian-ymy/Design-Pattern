package responsibilitychain;

//院长审批
public class DeanApprover extends Approver{
    public DeanApprover(String name) {
        super(name);
    }

    @Override
    public void HandlingTheRequest(SchoolRequest schoolRequest) {
        if(schoolRequest.getPrice()>5000&&schoolRequest.getPrice() <= 10000) {
            System.out.println(this.name+"能处理这个项目"+schoolRequest.getType());
            System.out.println("项目Id为"+schoolRequest.getId());
        }else {
            System.out.println(this.name+"表示不行，去找副校长");
            approver.HandlingTheRequest(schoolRequest);
        }
    }
}
