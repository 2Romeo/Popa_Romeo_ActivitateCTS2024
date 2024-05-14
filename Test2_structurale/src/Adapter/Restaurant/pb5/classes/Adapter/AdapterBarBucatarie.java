package Adapter.Restaurant.pb5.classes.Adapter;

import Adapter.Restaurant.pb5.classes.Adaptee.Bar;

public class AdapterBarBucatarie extends Bar implements SoftVechi {
    @Override
    public void printeazaBucatarie() {
        { System.out.println("printare bucatarie");}
    }
}
