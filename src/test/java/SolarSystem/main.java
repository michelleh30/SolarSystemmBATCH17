package SolarSystem;

public class main {
    public static void main(String[] args) {

        solarSystemBasic solarsys=new solarSystemBasic();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        //*******Feature Sun**********
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-123435kelvin";


        //********* Planet2******
        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="324568746843km";

        //********Planet1***********
        Planet1 plato=new Planet1();
        plato.color="green";
        plato.name="abracadabra";
        plato.temp="100000k";
        plato.radius="80000km";

    }
}
