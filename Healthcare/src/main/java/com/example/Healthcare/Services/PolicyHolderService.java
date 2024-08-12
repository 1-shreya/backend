package com.example.Healthcare.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Healthcare.Entity.PolicyHolder;
import com.example.Healthcare.Repository.PolicyHolderRepository;

@Service
public class PolicyHolderService  {
	

	    @Autowired
	    private PolicyHolderRepository policyHolderRepository;

	    public List<PolicyHolder> getAllPolicyHolders() {
	        return policyHolderRepository.findAll();
	    }

	    public Optional<PolicyHolder> getPolicyHolderById(int id) {
	        return policyHolderRepository.findById(id);
	    }

	    public PolicyHolder createPolicyHolder(PolicyHolder policyHolder) {
	        return policyHolderRepository.save(policyHolder);
	    }

	    public void deletePolicyHolder(int id) {
	        policyHolderRepository.deleteById(id);
	    }
	}


