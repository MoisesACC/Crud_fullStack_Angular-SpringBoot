package com.codeapp.crudfullstack.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timeStamp;
    private String message;
    private String path;
    private String errorCode;

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timeStamp, String message, String path, String errorCode) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.path = path;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
