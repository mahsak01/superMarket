package com.example.SuperMarket.Models.extras;


import org.springframework.stereotype.Component;

@Component
public class Response {

    public enum Status{
        FAILED, SUCCESS
    }

    private Status status;
    private Object Message;

    public Response() {
    }

    public Response(Status status, Object Message) {
        this.status = status;
        this.Message = Message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getMessage() {
        return Message;
    }

    public void setMessage(Object message) {
        this.Message = message;
    }
}
