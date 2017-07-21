package com.epam.lab.lab_07_homework_pattern.prototype;

public class DroidCopyFactory {
    Droid droid;

    public DroidCopyFactory(Droid droid) {
        this.droid = droid;
    }

    public void setDroid(Droid droid) {
        this.droid = droid;
    }
    Droid copyDroid(){
        return (Droid) droid.copy();
    }
}
