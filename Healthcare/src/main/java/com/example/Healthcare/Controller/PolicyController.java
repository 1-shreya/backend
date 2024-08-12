package com.example.Healthcare.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Healthcare.Entity.Policy;
import com.example.Healthcare.Services.PolicyService;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {
	
		@Autowired
		private PolicyService policyService;
		@GetMapping
	    public ResponseEntity<List<Policy>> getAllPolicies() {
	        List<Policy> policies = policyService.getAllPolicies();
	        return new ResponseEntity<>(policies, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Policy> getPolicyById(@PathVariable int id) {
	        Optional<Policy> policy = policyService.getPolicyById(id);
	        return policy.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping
	    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy) {
	        Policy savedPolicy = policyService.savePolicies(policy);
	        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Policy> updatePolicy(@PathVariable int id, @RequestBody Policy policy) {
	        Optional<Policy> existingPolicy = policyService.getPolicyById(id);
	        if (existingPolicy.isPresent()) {
	            policy.setId(id);
	            Policy updatedPolicy = policyService.savePolicies(policy);
	            return new ResponseEntity<>(updatedPolicy, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<HttpStatus> deletePolicy(@PathVariable int id) {
	        Optional<Policy> policy = policyService.getPolicyById(id);
	        if (policy.isPresent()) {
	            policyService.deletePolicyById(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
		
		
	
	

}
