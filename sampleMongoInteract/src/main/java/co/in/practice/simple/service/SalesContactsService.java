package co.in.practice.simple.service;

import co.in.practice.simple.models.SalesContact;
import co.in.practice.simple.service.exceptions.ServiceException;
import co.in.practice.simple.service.repositories.SalesContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
public class SalesContactsService {

    @Autowired
    private SalesContactRepository salesContactRepository;

    public SalesContact createSalesContacts(SalesContact salesContact) throws ServiceException {

        SalesContact salesContactToCreate = salesContact;
        if (StringUtils.isEmpty(salesContactToCreate.getName())) {
            throw new ServiceException("Sales agent name is required", "400");
        }
        if (StringUtils.isEmpty(salesContactToCreate.getAreaResponsible())) {
            throw new ServiceException("Area details are required", "400");
        }
        if (StringUtils.isEmpty(salesContactToCreate.getAreaResponsible().getCity())) {
            throw new ServiceException("Area details are required", "400");
        }
        String uniqueId = UUID.randomUUID().toString();

        salesContactToCreate.setId(uniqueId);
        salesContactRepository.save(salesContactToCreate);
        return salesContactToCreate;
    }

    public SalesContact findSpecificContact(String id) {
        Optional<SalesContact> salesContactOfId = salesContactRepository.findById(id);
        if (salesContactOfId.isPresent()) {
            SalesContact salesContact = salesContactOfId.get();
            return salesContact;
        }
        return null;
    }

    public List<SalesContact> searchSalesContactFor(Map pinCode) {
        if (null == pinCode) {
            return null;
        }
        /*for (Iterator keys: pinCode) {

        }
        *///ExampleMatcher matcher = ExampleMatcher.matchingAny();
        Example searchCriteria = Example.of(SalesContact.from(pinCode));
        List<SalesContact> salesContactOfId = salesContactRepository.findAll(searchCriteria);
        return salesContactOfId;
    }

    public List<SalesContact> findAllContact() {
        List <SalesContact> salesContactList = salesContactRepository.findAll();
        return salesContactList;
    }
}
