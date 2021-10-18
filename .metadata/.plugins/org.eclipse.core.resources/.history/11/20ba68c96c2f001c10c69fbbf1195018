package com.cjc.main.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.Document;
import com.cjc.main.serviceI.ServiceI;
import com.google.gson.Gson;
@RestController
@CrossOrigin("*")
@RequestMapping("/document")
public class DocController {

	
	@Autowired
	ServiceI si;
	
	@RequestMapping(value = "/adddoc",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<Document> uploadFile(@RequestPart(required = true, value = "address_proof") MultipartFile files1,
			@RequestPart(required  = true, value = "photo") MultipartFile files2,
			@RequestPart(required = true, value = "signature") MultipartFile files3,
			@RequestPart(required = true, value = "thumb") MultipartFile files4,
			@RequestPart("doc") String doc) throws IOException{
		
		Document document=new Document();
		document.setAddress_proof(files1.getBytes());
		document.setPhoto(files2.getBytes());
		document.setSignature(files3.getBytes());
		document.setThumb(files4.getBytes());
		
		Gson gson=new Gson();
		
		Document document1=gson.fromJson(doc, Document.class);
		document.setCustomerid(document1.getCustomerid());
		System.out.println(document);
		
		List<Document> list=si.savedoc(document);
		return list;
}
	@RequestMapping(value="/files",method = RequestMethod.GET)
	public List<Document> getFiles()
	{
		return si.getDoc();
	}
	@GetMapping("/singleData/{documentid}")
	public Document getdata(@PathVariable int documentid)
	{
		return si.singleData(documentid);
	}
	
	
}