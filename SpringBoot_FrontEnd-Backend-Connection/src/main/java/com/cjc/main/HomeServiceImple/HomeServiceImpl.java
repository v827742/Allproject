package com.cjc.main.HomeServiceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeServiceI.HomeServiceI;
import com.cjc.main.Model.Student;
import com.cjc.main.StudentRepository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student stu) {
		
              hr.save(stu);
		
		
		
	}

	@Override
	public List<Student> getAllData() {
		
		return (List<Student>) hr.findAll();
	}

	@Override
	public Student editData(int sid) {
		
		return hr.findAllBySid(sid);
	}

	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public Student updateData(Student sid) {
		
		return hr.save(sid);
	}

}
