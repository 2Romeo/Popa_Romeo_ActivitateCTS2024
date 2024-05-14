package Proxy.CCTV.model;

public class ProxyCamera implements ProxyAbstract{
    ProxyAbstract camera;

    public ProxyCamera(ProxyAbstract camera) {
        this.camera = camera;
    }

    @Override
    public void faPoza(Senzor senzor) {
        if(senzor.senzorActivat == true){
            camera.faPoza(senzor);
        }
    }
}
