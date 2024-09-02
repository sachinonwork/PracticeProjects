package co.in.practice.simple.controllers;

import co.in.practice.simple.models.SalesContact;
import co.in.practice.simple.service.SalesContactsService;
import co.in.practice.simple.service.exceptions.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;


@RestController
public class SampleApis {

    @Autowired
    private SalesContactsService salesContactService;

    @PostMapping(value = "/sales/contact")
    public ResponseEntity createSales(@RequestBody SalesContact salesContact) {

        if(salesContact == null) {
            return ResponseEntity.badRequest().body("Request is missing with required data");
        }
        try {
            salesContactService.createSalesContacts(salesContact);
        } catch (ServiceException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();

    }


    @GetMapping(value = "/sales/contact/{id}")
    public ResponseEntity<SalesContact> salesContactForId(@PathVariable String id) {

        if (id == null) {
            return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).build();
        }
        SalesContact salesContactData = salesContactService.findSpecificContact(id);
        return ResponseEntity.ok(salesContactData);

    }


    @GetMapping(value = "/sales/contact")
    public ResponseEntity<List> salesContactForId() {

        List<SalesContact> salesContactData = salesContactService.findAllContact();
        return ResponseEntity.ok(salesContactData);

    }

    @GetMapping(value = "/sales/contact/search")
    public ResponseEntity lookupSalesContact(@RequestParam("pinCode") Map pinCode) {

        if (pinCode == null) {
            return ResponseEntity.badRequest().body("Request expected with search parameter");
        }
        List<SalesContact> salesContact = salesContactService.searchSalesContactFor(pinCode);
        return ResponseEntity.ok(salesContact);

    }
}
