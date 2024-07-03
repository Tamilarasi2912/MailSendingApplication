package com.tamil.EmailSending.Controller;

import com.tamil.EmailSending.Service.EmailSenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/mail")
public class EmailController {

    private EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam(value ="file",required = false) MultipartFile[] file, String to, String subject, String body){
    return emailSenderService.sendEmail(file,to,subject,body);
    }
}
