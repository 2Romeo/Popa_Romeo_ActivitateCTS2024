package Proxy.CCTV.main;

import Proxy.CCTV.model.ProxyCamera;
import Proxy.CCTV.model.Camera;
import Proxy.CCTV.model.Senzor;

public class program {
    public static void main(String[] args) {
        ProxyCamera p1 = new ProxyCamera(new Camera());
        Senzor s1 = new Senzor(true);
        Senzor s2 = new Senzor(false);

        p1.faPoza(s1);
        p1.faPoza(s2);
    }
}
