package com.sunform.backend.repository;

import com.sunform.backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository
        extends JpaRepository<Project, UUID> {
}
