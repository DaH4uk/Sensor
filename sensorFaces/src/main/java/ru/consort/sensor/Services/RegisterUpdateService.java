package ru.consort.sensor.Services;

import ru.consort.sensor.handlers.ExceptionHandler;

import java.util.Date;

import static ru.consort.sensor.Services.RegisterService.getAllRegisters;

/**
 * Created by DaH4uk on 11.07.2016.
 * Realised registerInfo functionality.
 * https://konsort.planfix.ru/task/32615
 */


public class RegisterUpdateService {
    private static RegisterUpdateService ourInstance;
    private boolean flag;
    public synchronized static RegisterUpdateService getInstance() {
        if (ourInstance == null){
            ourInstance = new RegisterUpdateService();
        }
        return ourInstance;
    }

    private RegisterUpdateService() {

        Thread thread = new Thread(() -> {
            int i = 0;
            flag = false;
            while (true){
                getAllRegisters();
                flag = true;
                System.out.println(new Date() + " Register data has been updated");
                i++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    ExceptionHandler.logger.error(new Date() + " Exception with RegisterService (waiting reuse): ", e);
                    e.printStackTrace();
                }

            }

        });

        thread.start();
        while (!flag){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                ExceptionHandler.logger.error(new Date() + " Exception with RegisterService (waiting thread): ", e);
                e.printStackTrace();
            }
        }
    }
}
