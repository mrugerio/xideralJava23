package com.java.academy.finalproject.rest.services;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import com.java.academy.finalproject.rest.observer.DataObserved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import com.java.academy.finalproject.rest.repositories.AcademyFormDataRepository;

@Service
public class AcademyFormDataService extends DataObserved {
    private static final Logger LOGGER = LoggerFactory.getLogger(AcademyFormDataService.class);

    private final AcademyFormDataRepository academyFormDataRepository;

    @Autowired
    public AcademyFormDataService(AcademyFormDataRepository academyFormDataRepository) {
        this.academyFormDataRepository = academyFormDataRepository;
    }

    public AcademyFormData saveAcademyFormData(AcademyFormData academyFormData) {
        try {
            AcademyFormData savedAcademyFormData = academyFormDataRepository.saveAndFlush(academyFormData);
            notifyObservers(savedAcademyFormData);
            return savedAcademyFormData;
        } catch (Exception e) {
            LOGGER.error("Error saving academy form data", e);
            throw e;
        }
    }

    public List<AcademyFormData> getAllAcademyFormData() {
        try {
            return academyFormDataRepository.findAll();
        } catch (Exception e) {
            LOGGER.error("Error retrieving all academy form data", e);
            throw e;
        }
    }

    public AcademyFormData updateAcademyFormData(long id, AcademyFormData academyFormData) {
        AcademyFormData updatedAcademyFormData = academyFormDataRepository.saveAndFlush(academyFormData);
        notifyObservers(updatedAcademyFormData);
        return updatedAcademyFormData;
    }

    public void deleteAcademyFormData(long id) {
        AcademyFormData deletedAcademyFormData = academyFormDataRepository.getReferenceById(id);
        academyFormDataRepository.deleteById(id);
        notifyObservers(deletedAcademyFormData);
    }

    public void deleteAcademyFormData(AcademyFormData academyFormData) {
        academyFormDataRepository.delete(academyFormData);
    }
}
