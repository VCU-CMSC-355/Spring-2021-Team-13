
/************************************************************
 * Module Name: Utility Module
 * Description: This module uses the Service Broker to
 * display translated erros.
 *
 ************************************************************
 * Input: Error Number
 * Output: Error Description / Translation
 ************************************************************
 * Maintanence Log
 ************************************************************
 * FIX001: 04/24/2021 Jamarr Brooks
 * Uses ENUMS for service broker calls
 *
 ************************************************************/

package com.example.darwinsource.data;

public static enum msgEng {
    404("Not Found", 0),
        703("Service Not Found", 1),
        805("Language Not Found", 2),
        813("Word Not Found", 3),
        903("Tax Year Not Found", 4);

    private String stringValue;
    private int intValue;
    private msgEng(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

public static enum msgGer {
    404("Nicht gefunden", 0),
        703("Service nicht gefunden", 1),
        805("Sprache nicht gefunden", 2),
        813("Wort nicht gefunden", 3),
        903("Steuerjahr Nicht gefunden", 4);

    private String stringValue;
    private int intValue;
    private msgGer(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

public static enum msgSpa {
    404("No encontrado", 0),
        703("Servicio no encontrado", 1),
        805("Idioma no encontrado", 2),
        813("Palabra no encontrada", 3),
        903("Año fiscal no encontrado", 4);

    private String stringValue;
    private int intValue;
    private msgSpa(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

public static enum msgKli {
    404("yavbe'", 0),
        703("Sovchu'be'", 1),
        805("pagh'e' neHbe'", 2),
        813("yav QImbe'", 3),
        903("yIttaHvIS mIw'a'", 4);

    private String stringValue;
    private int intValue;
    private msgKli(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

public static enum msgFre {
    404("Pas trouvé", 0),
        703("Service non trouvé", 1),
        805("Langue introuvable", 2),
        813("Mot introuvable", 3),
        903("Année d'imposition introuvable", 4);

    private String stringValue;
    private int intValue;
    private msgFre(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

