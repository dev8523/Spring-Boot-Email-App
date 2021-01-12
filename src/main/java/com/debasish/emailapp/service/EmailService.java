package com.debasish.emailapp.service;

import javax.mail.MessagingException;

import org.springframework.web.multipart.MultipartFile;

import com.debasish.emailapp.entity.Contact;

public interface EmailService {

	public void sendSimpleEmail(Contact contact) throws MessagingException;

	public void sendAttachmentEmail(Contact contact, MultipartFile file) throws MessagingException;

}