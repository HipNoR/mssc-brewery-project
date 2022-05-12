package guru.springframework.msscbreweryproject.service;

import guru.springframework.msscbreweryproject.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}
