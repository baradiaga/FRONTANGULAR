package com.example.recommendation.controller;

import com.example.recommendation.model.Test;
import com.example.recommendation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
@CrossOrigin(origins = "*") // à adapter selon votre frontend
public class TestController {

    @Autowired
    private TestService testService;
// Removed duplicate getTestById method that returns ResponseEntity<Test>


    @GetMapping
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }

    @GetMapping("/{id}")
    public Test getTestById(@PathVariable Long id) {
        return testService.getTestById(id)
                .orElseThrow(() -> new RuntimeException("Test not found with id " + id));
    }

    @PostMapping
    public Test createTest(@RequestBody Test test) {
        return testService.createTest(test);
    }

    @PutMapping("/{id}")
    public Test updateTest(@PathVariable Long id, @RequestBody Test test) {
        return testService.updateTest(id, test);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        testService.deleteTest(id);
    }
}
