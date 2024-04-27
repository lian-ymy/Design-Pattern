package responsibilitychain;

public class Client {
    public static void main(String[] args) {
        //提出请求
        SchoolRequest schoolRequest = new SchoolRequest("采购教学物品", 15000, 0);

        DirectorApprover directorApprover = new DirectorApprover("教导主任");
        DeanApprover deanApprover = new DeanApprover("院长");
        VicePresidentApprover vicePresidentApprover = new VicePresidentApprover("副校长");
        PresidentApprover presidentApprover = new PresidentApprover("校长");

        //设置好下一个处理的人
        //我们可以任意从中间进行职责派遣找到对应的负责人
        //因此我们可以让这几个职责负责者互相之间形成一个链状结构
        directorApprover.setApprover(deanApprover);
        deanApprover.setApprover(vicePresidentApprover);
        vicePresidentApprover.setApprover(presidentApprover);
        presidentApprover.setApprover(directorApprover);

        presidentApprover.HandlingTheRequest(schoolRequest);
    }
}
