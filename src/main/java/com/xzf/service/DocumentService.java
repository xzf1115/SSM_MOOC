package com.xzf.service;

import com.xzf.domain.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentService {

    public  List<Document> getAllDocuments() throws Exception;

    public  void removeDocumentsById(Integer id) throws Exception;

    public  List<Document> getDocumentsByName(String name) throws Exception;

}
