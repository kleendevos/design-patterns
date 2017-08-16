package com.realdolmen.ood020.Singleton;

import java.io.Serializable;

/**
 * Created by vdabcursist on 16/08/2017.
 */

public enum Application {
    INSTANCE
}
/* public class Application implements Serializable {
    // Serializable zorgt ervoor dat object gesaved kan worden ...
    // Class moet omgezet worden naar ENUM

    private static Application INSTANCE;
    // om toegang te geven tot variabele moet er een getter voorzien worden
    // je kan ook private static Application INSTANCE = new INSTANCE (); doen en de if weglaten hierdor wordt de INSTANCE wel altijd onmiddellijk aangemaakt en kan dit performance issues geven.


    private Application(){

    }
    //alleen class zelf kan constructor nog invullen

    public static synchronized Application getINSTANCE (){
        if (INSTANCE == null) {
            INSTANCE = new Application();
        }
        return  INSTANCE;
    }

    // wordt pas aangemaakt als de eerste keer wordt opgeroepen.
    // werkt niet als er met meerdere users tegelijkertijd gewerkt wordt dan moet methode "getinstance" afgeschermt worden door toevoeging van Synchronized.
} */
