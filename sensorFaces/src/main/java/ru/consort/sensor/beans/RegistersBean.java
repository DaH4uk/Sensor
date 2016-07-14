package ru.consort.sensor.beans;

/**
 * Created by DaH4uk on 05.07.2016.
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "registersBean")
@SessionScoped
public class RegistersBean {

    private String inputText;
    private String login;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {

        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {

        return login;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void showMessage() {
        FacesMessage message = new FacesMessage("Заголовок", "Частичное обновление страницы");
        message.setSeverity(FacesMessage.SEVERITY_INFO); //как выглядит окошко с сообщением
        FacesContext.getCurrentInstance().addMessage(null, message);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Всплывашка", "GrowlMessage"));

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Значение", inputText));
    }
}