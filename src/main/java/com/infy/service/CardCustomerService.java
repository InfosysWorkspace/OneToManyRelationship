package com.infy.service;

import com.infy.dto.CardDTO;
import com.infy.dto.CustomerDTO;
import com.infy.exception.InfyBankException;

import java.util.List;

public interface CardCustomerService {
    public CustomerDTO getCustomerDetails(Integer customerId) throws InfyBankException;
    public Integer addCustomer(CustomerDTO customerDTO) throws InfyBankException;
    public void issueCardToExistingCustomer(Integer customerId, CardDTO cardDTO) throws InfyBankException;
    public void deleteCardOfExistingCustomer(Integer customerId, List<Integer> cardIdsToDelete) throws InfyBankException;
    public void deleteCustomer(Integer customerId) throws InfyBankException;

}
