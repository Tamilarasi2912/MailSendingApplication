package com.tamil.EmailSending.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface EmailSenderService
{
     String sendEmail(MultipartFile[]file, String to, String subject, String body);
}
