package net.simplifiedcoding.retrofitandroidtutorial.models;

public class LoginResponse {

    private boolean error;
    private String message;
    private Result result;

    public LoginResponse(boolean error, String message, Result result) {
        this.error = error;
        this.message = message;
        this.result = result;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public Result getResult() {
        return result;
    }
}
