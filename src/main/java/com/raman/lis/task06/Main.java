package com.raman.lis.task06;

import com.raman.lis.task06.armyRobots.BlackArmyRobots;
import com.raman.lis.task06.armyRobots.WhiteArmyRobots;
import com.raman.lis.task06.factory.Factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int MAX_ROBOTS_IN_ARMY = 3;

    private static boolean flag = false;
    static int countWhiteArmy = 0;
    static int countBlackArmy = 0;
    private static final String NAME_WHITE_ARMY = "WhiteArmy";
    private static final String NAME_BLACK_ARMY = "BlackArmy";


    public static void main(String[] args) throws InterruptedException {

        Factory factory = new Factory();
        WhiteArmyRobots whiteArmyRobots = new WhiteArmyRobots(factory, NAME_WHITE_ARMY, countWhiteArmy);
        BlackArmyRobots blackArmyRobots = new BlackArmyRobots(factory, NAME_BLACK_ARMY, countBlackArmy);

        Thread whiteArmyThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!flag) {
                        whiteArmyRobots.createRobots();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread blackArmyThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!flag) {
                        blackArmyRobots.createRobots();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        whiteArmyThread.start();
        blackArmyThread.start();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

        Runnable createDetail = new Runnable() {
            @Override
            public void run() {
                factory.createDetail();
            }
        };
        ScheduledFuture<?> future = scheduledExecutorService
                .scheduleAtFixedRate(createDetail, 0, 1, TimeUnit.SECONDS);

        Runnable stopCreateArmy = new Runnable() {
            @Override
            public void run() {
                if (whiteArmyRobots.getCountRobots() >= MAX_ROBOTS_IN_ARMY
                        || blackArmyRobots.getCountRobots() >= MAX_ROBOTS_IN_ARMY) {
                    scheduledExecutorService.shutdown();
                    flag = true;
                } else {
                    scheduledExecutorService.schedule(this, 50, TimeUnit.MILLISECONDS);
                }
            }
        };
        scheduledExecutorService.schedule(stopCreateArmy, 1, TimeUnit.SECONDS);


        whiteArmyThread.join();
        blackArmyThread.join();

        if (flag) {
            if (countBlackArmy >= MAX_ROBOTS_IN_ARMY) {
                System.out.println("The winner:\t" + NAME_BLACK_ARMY);
            } else if (countWhiteArmy >= MAX_ROBOTS_IN_ARMY) {
                System.out.println("The winner:\t" + NAME_WHITE_ARMY);
            }

            System.out.println("Completed!!!");
        }

    }
}

