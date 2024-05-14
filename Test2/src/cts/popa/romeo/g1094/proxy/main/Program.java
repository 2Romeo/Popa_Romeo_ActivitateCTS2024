package cts.popa.romeo.g1094.proxy.main;

import cts.popa.romeo.g1094.observer.model.Camera;
import cts.popa.romeo.g1094.proxy.model.CameraCCTV;
import cts.popa.romeo.g1094.proxy.model.CameraProxy;

public class Program {
    public static void main(String[] args) {
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        Camera c3 = new Camera();
        CameraProxy proxy = new CameraProxy(c1);
        proxy.trimiteImagine();
        proxy.activeazaSenzor();
        proxy.setCamera(c2);
        proxy.trimiteImagine();
    }
}
