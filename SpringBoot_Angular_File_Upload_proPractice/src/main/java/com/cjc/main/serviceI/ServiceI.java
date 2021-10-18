package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Document;

public interface ServiceI {

	public List<Document> savedoc(Document d);
	public List<Document> getDoc();
	public Document singleData(int id);
}
