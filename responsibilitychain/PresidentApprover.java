package responsibilitychain;

public class PresidentApprover extends Approver{
    public PresidentApprover(String name) {
        super(name);
    }

    @Override
    public void HandlingTheRequest(SchoolRequest schoolRequest) {
        if(schoolRequest.getPrice() > 20000) {
            System.out.println(this.name+"能处理这个项目"+schoolRequest.getType());
            System.out.println("项目Id为"+schoolRequest.getId());
        }else {
            approver.HandlingTheRequest(schoolRequest);
        }
    }
}
