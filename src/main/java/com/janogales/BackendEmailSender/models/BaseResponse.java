/**
 * @Author: janogales
 * @Date: Oct 24, 2025 4:17:29 AM
 */
package com.janogales.BackendEmailSender.models;

public class BaseResponse {

    private int code;
    private String message;

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
