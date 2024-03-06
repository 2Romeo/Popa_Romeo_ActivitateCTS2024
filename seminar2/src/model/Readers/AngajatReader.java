package model.Readers;

import model.Clase.Angajat;
import model.Clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public List<model.Clase.Angajat> Angajat;
    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
