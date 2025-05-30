package com.example.recommendation.repository;

import com.example.recommendation.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si besoin
}
