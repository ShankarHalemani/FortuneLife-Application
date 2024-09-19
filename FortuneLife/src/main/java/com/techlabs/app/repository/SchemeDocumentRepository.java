package com.techlabs.app.repository;

import com.techlabs.app.entity.SchemeDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemeDocumentRepository extends JpaRepository<SchemeDocument, Long> {
}