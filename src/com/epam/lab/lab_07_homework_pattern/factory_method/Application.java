package com.epam.lab.lab_07_homework_pattern.factory_method;

public class Application {
    private DroidSelector droidSelector = new DroidSelector();

    public Application() {
        run();
    }

    private void run() {
        droidSelector.getDroid(DroidType.BUNDES_DROID).fight();
        droidSelector.getDroid(DroidType.ENGLISH_DROID).move();
        droidSelector.getDroid(DroidType.URAINE_DROID).move();
    }
}
