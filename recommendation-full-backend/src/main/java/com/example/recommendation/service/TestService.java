package com.example.recommendation.service;

import com.example.recommendation.model.Test;
import com.example.recommendation.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    public Optional<Test> getTestById(Long id) {
        return testRepository.findById(id);
    }

    public TestRepository getTestRepository() {
        return testRepository;
    }

    public void setTestRepository(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((testRepository == null) ? 0 : testRepository.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestService other = (TestService) obj;
        if (testRepository == null) {
            if (other.testRepository != null)
                return false;
        } else if (!testRepository.equals(other.testRepository))
            return false;
        return true;
    }

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public String toString() {
        return "TestService [testRepository=" + testRepository + ", getAllTests()=" + getAllTests()
                + ", getTestRepository()=" + getTestRepository() + ", hashCode()=" + hashCode() + ", getClass()="
                + getClass() + ", toString()=" + super.toString() + "]";
    }

    // Ajoute ici les autres méthodes nécessaires (save, delete, etc.)

    public Test createTest(Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Test updateTest(Long id, Test test) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteTest(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}