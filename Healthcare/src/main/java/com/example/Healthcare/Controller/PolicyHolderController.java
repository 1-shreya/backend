package com.example.Healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Healthcare.Entity.PolicyHolder;
import com.example.Healthcare.Services.PolicyHolderService;
@RestController
@RequestMapping("/api/policy-holders")

public class PolicyHolderController  {

	    @Autowired
	    private PolicyHolderService policyHolderService;

	    @GetMapping
	    public List<PolicyHolder> getAllPolicyHolders() {
	        return policyHolderService.getAllPolicyHolders();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<PolicyHolder> getPolicyHolderById(@PathVariable int id) {
	        return policyHolderService.getPolicyHolderById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PostMapping("/add")
	    public PolicyHolder createPolicyHolder(@RequestBody PolicyHolder policyHolder) {
	        return policyHolderService.createPolicyHolder(policyHolder);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletePolicyHolder(@PathVariable int id) {
	        policyHolderService.deletePolicyHolder(id);
	        return ResponseEntity.noContent().build();
	        //http://localhost:9090/api/policy-holders/1113
	    }
	}


