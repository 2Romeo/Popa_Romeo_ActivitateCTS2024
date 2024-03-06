package model.Readers;

import model.Clase.Angajat;
import model.Clase.Aplicant;
import model.Clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.citireAplicant(input2, elev);

        }

        input2.close();
        return elevi;
    }
}
