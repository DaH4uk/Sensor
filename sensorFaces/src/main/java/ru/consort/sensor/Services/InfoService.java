package ru.consort.sensor.Services;

import ru.consort.sensor.entities.Parameter;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DaH4uk on 04.08.2016.
 */
@ManagedBean(name = "infoService")
@ApplicationScoped
public class InfoService {

    private final static String[] parameterNames;

    private final static Integer[] parameterValues;

    static {
        parameterNames = new String[10];
        parameterNames[0] = "Часы";
        parameterNames[1] = "Минуты";
        parameterNames[2] = "Секунды";
        parameterNames[3] = "Число";
        parameterNames[4] = "Месяц";
        parameterNames[5] = "Год";
        parameterNames[6] = "Температура подачи";
        parameterNames[7] = "Температура обратки";
        parameterNames[8] = "Температура наружного воздуха";
        parameterNames[9] = "Температура горячей воды";

        parameterValues = new Integer[10];
        parameterValues[0] = new Date().getHours();
        parameterValues[1] = new Date().getMinutes();
        parameterValues[2] = new Date().getSeconds();
        parameterValues[3] = new Date().getDay();
        parameterValues[4] = new Date().getMonth()+1;
        parameterValues[5] = new Date().getYear()+1900;
        parameterValues[6] = 95;
        parameterValues[7] = 70;
        parameterValues[8] = 30;
        parameterValues[9] = 60;

    }

    public List<Parameter> createParameters(int size) {
        List<Parameter> list = new ArrayList<Parameter>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Parameter(parameterNames[i], parameterValues[i]));
        }

        return list;
    }

}
