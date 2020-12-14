package com.epam.user.controller;


import com.epam.user.dto.IdentificationNumberDto;
import com.epam.user.service.IdentificationNumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "Identification number management REST API")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})
@RequestMapping("/identification")
@Slf4j
@RestController
@RequiredArgsConstructor
public class IdentificationNumberController {

    private final IdentificationNumberService identificationNumberService;

    @ApiOperation("Set identification number (access only for ADMIN)")
    @ApiResponse(code = 200, message = "OK", response = IdentificationNumberDto.class)
    @PostMapping("/setIdentification")
    @ResponseStatus(HttpStatus.OK)
    public IdentificationNumberDto setIdentificationNumber(@Valid @RequestBody IdentificationNumberDto identificationNumberDto) {
        return identificationNumberService.addNewIdentificationNumber(identificationNumberDto);
    }

    @ApiOperation("Get list of all identification numbers")
    @ApiResponse(code = 200, message = "OK", response = List.class)
    @GetMapping("/identificationNumber")
    @ResponseStatus(HttpStatus.OK)
    public List<IdentificationNumberDto> getAllIdentificationNumbers() {
        return identificationNumberService.getAllIdentificationNumbers();
    }
}