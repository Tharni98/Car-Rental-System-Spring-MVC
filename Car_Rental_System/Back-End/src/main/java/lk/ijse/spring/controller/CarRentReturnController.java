package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarRentReturnDTO;
import lk.ijse.spring.service.CarRentReturnService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * author - Tharani
 * version - 1.0.0 10:12 PM 11/1/2023
 **/
@RestController
@RequestMapping("api/v1/carRentReturn")
@CrossOrigin
public class CarRentReturnController {
    @Autowired
    CarRentReturnService service;

    @GetMapping
    public ResponseUtil getAllCarRentReturns() {
        return new ResponseUtil(200, "Ok", service.getAllCarRentReturns());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveCarRentReturn(@RequestBody CarRentReturnDTO dto) {
        System.out.println(dto.toString());
        service.saveCarRentReturn(dto);
        return new ResponseUtil(200, "Saved", null);
    }

    @PutMapping
    public ResponseUtil updateCarRentReturn(@RequestBody CarRentReturnDTO dto) {
        service.updateCarRentReturn(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @DeleteMapping(params = {"returnId"})
    public ResponseUtil deleteCarRentReturn(@RequestParam String returnId) {
        service.deleteCarRentReturn(returnId);
        return new ResponseUtil(200, "Deleted", null);
    }

    @GetMapping(path = "/{returnId}")
    public ResponseUtil searchCarRentReturn(@PathVariable String returnId) {
        return new ResponseUtil(200, "OK", service.searchCarRentReturn(returnId));
    }

    @GetMapping(path = "/generateReturnId")
    public ResponseUtil generateReturnId() {
        return new ResponseUtil(200, "Ok", service.generateReturnId());
    }
}