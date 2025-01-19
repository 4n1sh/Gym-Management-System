package com.gym.model;

/**
 *
 * @author Anish
 */
public class RequestModel {

    private String Request;
    private String time;

    public RequestModel(String Request, String time) {
        this.Request = Request;
        this.time = time;
    }

    public String getRequest() {
        return Request;
    }

    public void setRequest(String Request) {
        this.Request = Request;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
