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
    }
}
