package com.epam.user.service;

import com.epam.user.dto.IdentificationNumberDto;

import java.util.List;

public interface IdentificationNumberService {

    IdentificationNumberDto addNewIdentificationNumber(IdentificationNumberDto identificationNumberDto);

    List<IdentificationNumberDto> getAllIdentificationNumbers();
}
