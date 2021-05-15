package com.raman.lis.task06.armyRobots;

import com.raman.lis.task06.details.PartsRobot;
import com.raman.lis.task06.factory.Factory;

import java.util.ArrayList;

import static com.raman.lis.task06.factory.Factory.bodyPartsQueue;

public abstract class ArmyRobots {

    private Factory factory;
    private String nameArmyRobots;
    private int countRobots;
    private ArrayList<PartsRobot> armyRobotsArrayList = new ArrayList<>();

    public ArmyRobots(Factory factory, String nameArmyRobots, int countRobots) {
        this.factory = factory;
        this.nameArmyRobots = nameArmyRobots;
        this.countRobots = countRobots;
    }

    public void createRobots() throws InterruptedException {
            synchronized (bodyPartsQueue) {
                for (int i = 0; i < factory.sizeStorage(); i++) {
                    PartsRobot partsRobot = factory.getDetail(i);
                    if (!armyRobotsArrayList.contains(partsRobot)
                            && partsRobot != null) {
                        armyRobotsArrayList.add(factory.getDetail(i));
                        System.out.println(nameArmyRobots
                                + "\trobots took detail:\t"
                                + factory.getDetail(i));
                        factory.deleteDetail(i);
                    }
                }

                if (armyRobotsArrayList.size() == factory.lengthPartsRobot()) {
                    countRobots++;
                    armyRobotsArrayList.clear();
                    System.out.println(nameArmyRobots
                            + "\trobots have:\t"
                            + countRobots
                            + "\trobots.");
                }
            }
        }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public String getNameArmyRobots() {
        return nameArmyRobots;
    }

    public void setNameArmyRobots(String nameArmyRobots) {
        this.nameArmyRobots = nameArmyRobots;
    }

    public int getCountRobots() {
        return countRobots;
    }

    public void setCountRobots(int countRobots) {
        this.countRobots = countRobots;
    }

    public ArrayList<PartsRobot> getArmyRobotsArrayList() {
        return armyRobotsArrayList;
    }

    public void setArmyRobotsArrayList(ArrayList<PartsRobot> armyRobotsArrayList) {
        this.armyRobotsArrayList = armyRobotsArrayList;
    }
}
