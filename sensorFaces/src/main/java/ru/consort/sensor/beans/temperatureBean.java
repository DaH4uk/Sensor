package ru.consort.sensor.beans;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


/**
 * Created by DaH4uk on 04.08.2016.
 * Realised temperature funtionallity
 */
@ManagedBean(name = "temperatureBean")
public class temperatureBean {
    private double value = 19;

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void onChange() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Вы выбрали: " + value, null));
    }


}
