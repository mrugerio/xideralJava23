package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springboot.cruddemo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public EmployeeServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Employee> findAll() {
//		logger.info("in getCustomers(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Employee>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<Employee>>() {});

		// get the list of customers from response
		List<Employee> employees = responseEntity.getBody();

		logger.info("in findAll(): employees" + employees);
		
		return employees;
	}

	@Override
	public Employee findById(int theId) {

//		logger.info("in getCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		Employee theEmployee = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Employee.class);

		logger.info("in findById(): theEmployee=" + theEmployee);
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
//		logger.info("in saveCustomer(): Calling REST API " + crmRestUrl);
		
		int employeeId = theEmployee.getId();

		// make REST call
		if (employeeId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, theEmployee, String.class);			
		
		} else {
			// update employee
			restTemplate.put(crmRestUrl, theEmployee);
		}

		logger.info("in Employee save(): success");	
		
	}

	@Override
	public void deleteById(int theId) {
		
//		logger.info("in deleteById(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteById(): deleted employee theId=" + theId);
		
	}

	

	
	
}






