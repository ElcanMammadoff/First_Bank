package com.musdon.first_bank_application.service.impl;

import com.musdon.first_bank_application.model.dto.BankResponse;
import com.musdon.first_bank_application.model.dto.CreditDebitRequest;
import com.musdon.first_bank_application.model.dto.EnquiryRequest;
import com.musdon.first_bank_application.model.dto.UserRequest;
import org.springframework.stereotype.Service;


public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);

}
