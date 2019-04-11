package pl.sda.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.sda.logging.systemX.EngineX;
import pl.sda.logging.systemY.EngineY;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Samples {
    //logger z nazwą stworzoną na podstawie nazwy klasy
    private static Logger logger = LoggerFactory.getLogger(Samples.class);

    public static void main(String[] args) {
        //#1 proste użycie Loggera
        basics();

        //#2 typowe logowanie w kodzie
        //logsFromObjects();

        //#3 logowanie w programie wielowątkowym
        //multiThreadedLogsFromObjects();
    }

    private static void basics() {
        //logger z nazwą podaną wprost przy tworzeniu
        Logger loggerWithCustomName = LoggerFactory.getLogger("MyLogger");
        loggerWithCustomName.info("Start of application.");

        logger.info("Start of application.");

        logger.error("This is error", new IllegalArgumentException("argument is not valid"));
        logger.warn("This is warning");
        logger.info("This is info with parameter: {}", 101);
        logger.debug("This is debug");
        logger.trace("This is trace");
    }

    private static void logsFromObjects() {
        //logowanie zdarzeń w obiekcie klasy EngineX
        runEngineX();

        //logowanie zdarzeń w obiekcie klasy EngineY
        runEngineY();
    }

    private static void multiThreadedLogsFromObjects() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(Samples::runEngineX);
        executorService.submit(Samples::runEngineY);
        executorService.shutdown();
    }

    private static void runEngineY() {
        EngineY yEngine = new EngineY();
        yEngine.startEngine(50);
        yEngine.transformObject(10.7);
        yEngine.transformObject(10);
        yEngine.transformObject("BlackWhole-54A1");
        yEngine.transformObject("ERROR");
        yEngine.transformObject("BlackWhole-41A1");
        yEngine.stopEngine();
    }

    private static void runEngineX() {
        EngineX xEngine = new EngineX();
        xEngine.startEngine(10);
        xEngine.transformObject(10);
        xEngine.transformObject("Rocket-V");
        xEngine.transformObject("ERROR");
        xEngine.transformObject(101);
        xEngine.stopEngine();
    }
}
