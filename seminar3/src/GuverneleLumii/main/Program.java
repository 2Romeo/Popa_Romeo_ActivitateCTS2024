package GuverneleLumii.main;

import GuverneleLumii.model.GuverneRegistry;
import singleton.Guvern;

public class Program {
    public static void main(String[] args) {
        GuverneRegistry guverneRegistry = GuverneRegistry.GetInstance();
        guverneRegistry.AddGuvern("11","adsad",20);
        guverneRegistry.AddGuvern("11","adsad1231",20);

        guverneRegistry.getGuvern("11");

        guverneRegistry.getGuvern("11").setNumePrimMinistru("numeprimministru");

        System.out.println(guverneRegistry.getGuvern("11").getNumePrimMinistru());

    }
}
