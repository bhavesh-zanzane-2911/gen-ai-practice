package com.bhavesh.genai.dto;

public class InputMessageDTO {
    private String message;

    public InputMessageDTO(String systemMessage, String message) {
        this.systemMessage = systemMessage;
        this.message = message;
    }

    public String getSystemMessage() {
        return systemMessage;
    }

    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }

    private String systemMessage;

    public InputMessageDTO() {

    }
    public InputMessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
