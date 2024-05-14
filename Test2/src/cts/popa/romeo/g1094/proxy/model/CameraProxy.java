package cts.popa.romeo.g1094.proxy.model;

public class CameraProxy implements CameraCCTV {
    CameraCCTV camera;
    boolean senzorActivat = false;

    public CameraProxy(CameraCCTV camera) {
        this.camera = camera;
    }

    @Override
    public void trimiteImagine() {
        if(senzorActivat == true){
            camera.trimiteImagine();
        }else{
            System.out.println("Senzor nu e activat");
        }
    }

    public void setCamera(CameraCCTV camera) {
        this.camera = camera;
    }

    @Override
    public void activeazaSenzor() {
        senzorActivat = true;
    }
}
