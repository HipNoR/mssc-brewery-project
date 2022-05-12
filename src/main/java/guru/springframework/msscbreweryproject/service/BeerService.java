package guru.springframework.msscbreweryproject.service;

import guru.springframework.msscbreweryproject.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
