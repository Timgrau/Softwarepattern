package com.company;

public class SimpleSchuheFactory {
    
    public static ISchuhe getSchuh(String model){
        if ( model.contentEquals("Turnschuhe") ) {
            getResponse(model);
            return new Turnschuhe();
        }
        else if( model.contentEquals("Wanderschuhe") ) {
            getResponse(model);
            return new Wanderschuhe();
        }
        else if( model.contentEquals("FlipFlops")) {
            getResponse(model);
            return new FlipFlops();
        } else {
            return null;
        }
    }
    private static void getResponse(String model) {
        System.out.println("Es wurde ein Modell von Typ " + model + " erzeugt.");
    }
}
