package facade.Spital.pb6.clase;

public class InternareFacade {
    public void interneazaPacient(Pacient pacient){
        Salon salon = new Salon(1,120);
        Medic medic = new Medic();

        if(medic.verificaPacient(pacient)){
            if(salon.getNrLocuriDisp() > 0){
                salon.ocupaPat();
            } else {
                System.out.println("Nu sunt suficiente locuri in salon");
            }
        }
        else {
            System.out.println("Pacientul " + pacient.getNume() + " nu trebuie internat");
        }

    }
}
