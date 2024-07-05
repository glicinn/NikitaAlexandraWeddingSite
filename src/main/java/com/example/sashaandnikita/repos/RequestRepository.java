package com.example.sashaandnikita.repos;

import com.example.sashaandnikita.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
    Request findById(long id);
}
