/**
 * @Author: janogales
 * @Date: Oct 24, 2025 3:04:45 AM
 */
package com.janogales.BackendEmailSender.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.janogales.BackendEmailSender.models.BaseResponse;
import com.janogales.BackendEmailSender.models.requests.LoginRequest;
import com.janogales.BackendEmailSender.utils.Constants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/sender")
public class SenderController {

    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        if ("admin".equals(username) && "password".equals(password)) {
            return new BaseResponse(Constants.RESPONSE_CODE_OK, "Login successful");
        }
        return new BaseResponse(Constants.RESPONSE_CODE_ERROR, "Invalid credentials");
    }
    

}
