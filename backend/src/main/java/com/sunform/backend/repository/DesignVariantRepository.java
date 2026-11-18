package com.sunform.backend.repository;

import com.sunform.backend.entity.DesignVariant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DesignVariantRepository extends JpaRepository<DesignVariant, UUID> {

    List<DesignVariant> findByProjectIdOrderByVersionNumberAsc(UUID projectId);

    Optional<DesignVariant> findByIdAndProjectId(UUID id, UUID projectId);

    Optional<DesignVariant> findFirstByProjectIdOrderByVersionNumberDesc(UUID projectId);
}