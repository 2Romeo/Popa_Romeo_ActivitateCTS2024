package cts.popa.romeo.g1094.observer.main;

import cts.popa.romeo.g1094.observer.model.Administrator;
import cts.popa.romeo.g1094.observer.model.Camera;

public class Program {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.adauga(new Administrator("ion"));
        camera.adauga(new Administrator("ionel"));
        camera.adauga(new Administrator("ionut"));

        camera.notificaObserveri("notifacer");
    }
}
