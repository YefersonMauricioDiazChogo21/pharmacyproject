package com.pharmacy.documenttype.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.documenttype.domain.entity.DocumentType;

public interface DocumentTypeService {
    void createDocumentType (DocumentType  documentType);
    void updateDocumentType (DocumentType documentType);
    DocumentType deleteDocumentType(String id);
    Optional<DocumentType> findDocumentTypeById(String id);
    List<DocumentType> findAllDocumentTypes();
}

