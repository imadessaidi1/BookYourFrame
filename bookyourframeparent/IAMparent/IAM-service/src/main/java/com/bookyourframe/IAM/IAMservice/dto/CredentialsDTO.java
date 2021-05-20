package com.bookyourframe.IAM.IAMservice.dto;

/**
 * Created by mac on 29/03/2020.
 */
public class CredentialsDTO {

    private String logging;
    private String password;

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
