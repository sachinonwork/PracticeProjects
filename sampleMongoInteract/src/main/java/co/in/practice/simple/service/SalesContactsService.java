package co.in.practice.simple.service;

import co.in.practice.simple.models.SalesContact;
import co.in.practice.simple.service.exceptions.ServiceException;
import co.in.practice.simple.service.repositories.SalesContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

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
        return null;
    }
}
