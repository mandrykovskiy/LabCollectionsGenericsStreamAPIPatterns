package com.epam.lab.lab_07_homework_pattern.factory_method;

public class DroidSelector {
    private Droid droid = null;

    public Droid getDroid(DroidType droidType) {
        switch (droidType) {
            case URAINE_DROID:
                droid = new UkraineDriod();
                break;
            case ENGLISH_DROID:
                droid = new EngDroid();
                break;
            case BUNDES_DROID:
                droid = new BundesDroid();
                break;
        }
        return droid;
    }
}
