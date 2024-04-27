package responsibilitychain;

//审批者
public abstract class Approver {
    //聚合，下一个处理的审批者
    Approver approver;
    //当前审批者的部门名
    String name;

    //初始化

    public Approver(String name) {
        this.name = name;
    }

    //设置下一个审批者到底是谁

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的办法
    public abstract void HandlingTheRequest(SchoolRequest schoolRequest);
}
