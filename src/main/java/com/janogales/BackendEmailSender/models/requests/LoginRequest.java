/**
 * @Author: janogales
 * @Date: Oct 24, 2025 4:30:18 AM
 */
package com.janogales.BackendEmailSender.models.requests;

public class LoginRequest {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
