package responsibilitychain;

//教导主任审批
public class DirectorApprover extends Approver{
    public DirectorApprover(String name) {
        super(name);
    }

    @Override
    public void HandlingTheRequest(SchoolRequest schoolRequest) {
        if(schoolRequest.getPrice() <= 5000) {
            System.out.println(this.name+"能处理这个项目"+schoolRequest.getType());
            System.out.println("项目Id为"+schoolRequest.getId());
        }else {
            System.out.println(this.name+"表示不行，去找院长");
            approver.HandlingTheRequest(schoolRequest);
        }
    }
}
