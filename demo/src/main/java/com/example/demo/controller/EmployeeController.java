package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Stock;
import com.example.demo.model.StockWrapper;
import com.example.demo.utility.Constant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.example.demo.utility.Constant.*;


@RestController
public class EmployeeController {
	
	
	@GetMapping(value="wcome")
	public StockWrapper Test() {
		 final String uri = "https://www.alphavantage.co/query?function=BATCH_STOCK_QUOTES&symbols=MSFT,FB&apikey=GBH7MF97B29TB0Q0";

		    RestTemplate restTemplate = new RestTemplate();
		    
		    StockWrapper result = restTemplate.getForObject(uri, StockWrapper.class);
		    
		    System.out.println(result.getMetaData().getInformation());
		
		return result;
	}
}
	/*@PostMapping(value=Constant.SAVE_EMPLOYEE)
	public String getEmployeeByid(@Valid @RequestBody Employee employee) {
		
		Employee empDb = employeeService.getEmployeeById(employee);
		if (null ==empDb)
			throw new CustomException("Employee id not found :"+employee.getEmployeeId() );
		return employeeService.getEmployeeById(employee);
	}*/
	
	/*@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public String welcomeEmployee() {
		
		return "Welcome Sir";
	}
	
	@PostMapping(value="/saveemployee")
	public String welcomeMessage(@RequestBody Employee employee) {
		
		
		return employeeService.saveEmployee(employee);
	}
	
	@PostMapping(value="/getemployee")
	public Employee getEmployeeByid(@Valid @RequestBody Employee employee) {
		
		Employee empDb = employeeService.getEmployeeById(employee);
		if (null ==empDb)
			throw new CustomException("Employee id not found :"+employee.getEmployeeId() );
		return employeeService.getEmployeeById(employee);
	}
	
	@GetMapping("/helloemployee")
	public List<Employee> getEmployee(){
		
		return employeeService.getEmployee();
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		
		Return String empl
	}*/

