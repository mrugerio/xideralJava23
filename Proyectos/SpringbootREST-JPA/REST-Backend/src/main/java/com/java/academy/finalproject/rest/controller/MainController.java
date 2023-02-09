package com.java.academy.finalproject.rest.controller;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import com.java.academy.finalproject.rest.exceptions.AcademyMemberNotFoundException;
import com.java.academy.finalproject.rest.observer.DataObserved;
import com.java.academy.finalproject.rest.observer.DataObserver;
import com.java.academy.finalproject.rest.repositories.AcademyFormDataRepository;
import com.java.academy.finalproject.rest.services.AcademyFormDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class MainController extends DataObserved {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private AcademyFormDataService academyFormDataService;

    @Autowired
    private AcademyFormDataRepository academyFormDataRepository;

    @Override
    public void addObserver(DataObserver dataObserver) {
        super.addObserver(dataObserver);
    }

    @Override
    public void removeObserver(DataObserver dataObserver) {
        super.removeObserver(dataObserver);
    }

    @Override
    public void notifyObservers(AcademyFormData academyFormData) {
        super.notifyObservers(academyFormData);
    }

    /*
     * This method is used to check if the application is running
     */
    @GetMapping("/healthCheck")
    public HttpStatus helloWorld() {
        LOGGER.info("Application is running");
        return HttpStatus.OK;
    }


    /*
     * This method is used to get all the data from the database
     */
    @GetMapping("/academyApplications")
    public List<AcademyFormData> getAcademyFormApplications() {

        if (academyFormDataService.getAllAcademyFormData().isEmpty()) {
            LOGGER.info("No data found");
            throw new AcademyMemberNotFoundException("No data found");
        }

        LOGGER.info("Getting all academy form data");
        return academyFormDataService.getAllAcademyFormData();
    }


    /*
     * This method is used to get a specific item from the database
     */
    @GetMapping(path = "/academyApplications/{id}")
    public ResponseEntity<AcademyFormData> getAcademyMember(@PathVariable long id) {
        LOGGER.debug("Getting academy member with id: {}", id);
        Optional<AcademyFormData> academyFormDataOptional = academyFormDataRepository.findById(id);
        return academyFormDataOptional.map(academyFormData -> new ResponseEntity<>(academyFormData, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    /*
     * This method is used to save the data to the database
     */
    @PostMapping(path="/academyApplications", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveAcademyFormData(@RequestBody AcademyFormData academyFormData) {

        LOGGER.debug("Saving academy form data with id: {}", academyFormData.getId());

        if (academyFormDataService.getAllAcademyFormData().stream().anyMatch(a -> Objects.equals(a.getId(), academyFormData.getId())))
            throw new AcademyMemberNotFoundException("Id already exists" + HttpStatus.CONFLICT);

        academyFormDataRepository.saveAndFlush(academyFormData);

        // Notify observers
        for (DataObserver dataObserver : dataObservers) {
            dataObserver.update(academyFormData);
        }

        LOGGER.debug("Academy form data saved with id {}", academyFormData.getId());

        return new ResponseEntity<>("Academy Member Created. \n{\"id\":" + academyFormData.getId() + '}', HttpStatus.CREATED);
    }

    /*
     * This method is used to update the data in the database
     */
    @PutMapping(path="/academyApplications/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateAcademyFormData(@PathVariable Long id, @RequestBody AcademyFormData academyFormData) {
        LOGGER.debug("Updating academy form data with id: {}", id);

        if (academyFormDataRepository.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        academyFormData.setId(id);
        academyFormDataRepository.save(academyFormData);
        LOGGER.debug("Academy form data with id {} updated", id);

        return new ResponseEntity<>("Academy Member updated", HttpStatus.OK);
    }


    /*
     * This method is used to delete a data from the database
     */
    @DeleteMapping("/academyApplications/{id}")
    public ResponseEntity<String> deleteAcademyFormData(@PathVariable long id) {

        Optional<AcademyFormData> academyFormDataOptional = academyFormDataRepository.findById(id);
        if (academyFormDataOptional.isEmpty()) {
            LOGGER.warn("Academy Member with id {} not found", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        academyFormDataRepository.delete(academyFormDataOptional.get());
        LOGGER.info("Academy Member with id {} deleted successfully", id);
        return new ResponseEntity<>("Academy Member deleted", HttpStatus.OK);
    }


    /*
     * This method is used to delete all the data from the database
     */
    @DeleteMapping("/academyApplications")
    public ResponseEntity<String> deleteAllAcademyFormData() {
        academyFormDataRepository.deleteAll();
        LOGGER.info("All Academy Members deleted successfully");
        return new ResponseEntity<>("All Academy Members deleted", HttpStatus.OK);
    }

}