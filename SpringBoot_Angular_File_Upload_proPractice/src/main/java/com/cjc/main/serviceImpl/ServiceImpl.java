package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.DocumentRepository;
import com.cjc.main.model.Document;
import com.cjc.main.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
     @Autowired
	DocumentRepository dr;
	@Override
	public List<Document> savedoc(Document d) {

		System.out.println("service data:-"+d);
		dr.save(d);
		List<Document> l1=dr.findAll();
		return l1;
	
	}

	public List<Document> getDoc() {
		List<Document> l1=dr.findAll();
			return l1;
		}

	@Override
	public Document singleData(int id) {
		Document d=(Document) dr.findAllByDocumentid(id);
		return d;
	}
		
}
