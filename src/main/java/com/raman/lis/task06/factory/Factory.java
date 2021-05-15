package com.raman.lis.task06.factory;

import com.raman.lis.task06.details.PartsRobot;

import java.util.ArrayList;
import java.util.Random;

public class Factory {

    public static ArrayList<PartsRobot> bodyPartsQueue = new ArrayList<>();
    private Random random = new Random();

    public void createDetail() {
        System.out.println("Factory create detail.");
            bodyPartsQueue.add(randomParts());
            System.out.println("In storage:");
            for (PartsRobot elements : bodyPartsQueue) {
                System.out.println(elements);
            }
    }

    public PartsRobot getDetail(int i) {
        if (!bodyPartsQueue.isEmpty()) {
            return bodyPartsQueue.get(i);
        }
        System.out.println("Part not found in storage.");
        return null;
    }

    public void deleteDetail(int i) {
        bodyPartsQueue.remove(bodyPartsQueue.get(i));
    }

    public PartsRobot randomParts() {
        PartsRobot[] partRobots = PartsRobot.values();
        return partRobots[random.nextInt(partRobots.length)];
    }

    public int lengthPartsRobot() {
        PartsRobot[] partRobots = PartsRobot.values();
        return partRobots.length;
    }

    public int sizeStorage() {
        return bodyPartsQueue.size();
    }

}



