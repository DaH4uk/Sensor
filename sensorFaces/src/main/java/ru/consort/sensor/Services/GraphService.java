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
@ManagedBean(name = "graphService")
@ApplicationScoped
public class GraphService {
    private final static String[] parameterNames;

    private final static Integer[] parameterValues;

    static {
        parameterNames = new String[6];
        parameterNames[0] = "15 °C";
        parameterNames[1] = "5 °C";
        parameterNames[2] = "-5 °C";
        parameterNames[3] = "15 °C";
        parameterNames[4] = "20 °C";
        parameterNames[5] = "30 °C";

        parameterValues = new Integer[6];
        parameterValues[0] = 30;
        parameterValues[1] = 35;
        parameterValues[2] = 50;
        parameterValues[3] = 60;
        parameterValues[4] = 80;
        parameterValues[5] = 90;


    }

    public List<Parameter> createParameters(int size) {
        List<Parameter> list = new ArrayList<Parameter>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Parameter(parameterNames[i], parameterValues[i]));
        }

        return list;
    }
}
