package com.cjc.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

	
	
	
	public Document findAllByDocumentid(int documentid);

}
