package dkovalenko.tests.prototype.cleaner;

import dkovalenko.tests.prototype.Robot;

public class Cleaner implements Robot {

    private String version;
    private String name;
    private int countOfCall = 0;

    public Cleaner(String version, String name) {
        this.version = version;
        this.name = name;
    }

    @Override
    public void say() {
        countOfCall++;
        System.out.println(countOfCall + ". I am robot-cleaner (v." + version + ") and my name is " + name);
    }

    @Override
    public Cleaner clone() {
        Cleaner robot = new Cleaner(version, name);
        robot.countOfCall = countOfCall;
        return robot;
    }

}
