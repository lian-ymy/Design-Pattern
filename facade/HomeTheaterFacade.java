package facade;

//外观类
public class HomeTheaterFacade {
    //管理多个设备
    private DVDPlayer dvdPlayer;
    private PopCorn popCorn;
    private LampLight lampLight;

    public HomeTheaterFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        popCorn = PopCorn.getInstance();
        lampLight = LampLight.getInstance();
    }

    //观影前准备
    public void ready() {
        popCorn.openPop();
        popCorn.pop();
        lampLight.openLamp();
    }

    //观影中管理
    public void play() {
        dvdPlayer.open();
    }

    //暂停观影
    public void pause() {
        dvdPlayer.pause();
    }

    //结束观影
    public void end() {
        dvdPlayer.close();
        popCorn.closePop();
        lampLight.closeLamp();
    }
}

