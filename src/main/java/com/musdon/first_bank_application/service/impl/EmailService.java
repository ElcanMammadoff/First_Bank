package com.musdon.first_bank_application.service.impl;

import com.musdon.first_bank_application.model.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlerts(EmailDetails emailDetails);
}
