package com.example.Healthcare.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Healthcare.Entity.Policy;
import com.example.Healthcare.Repository.PolicyRepository;
@Service
public class PolicyService {
	@Autowired
    private PolicyRepository policyRepository;

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Optional<Policy> getPolicyById(int id) {
        return policyRepository.findById(id);
    }

    public Policy savePolicies(Policy policy) {
        return policyRepository.save(policy);
    }

    public void deletePolicyById(int id) {
        policyRepository.deleteById(id);
    }

}
