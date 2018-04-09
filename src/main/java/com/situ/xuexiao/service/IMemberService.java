package com.situ.xuexiao.service;

import java.util.List;

import com.situ.xuexiao.pojo.Member;
import com.situ.xuexiao.vo.PageBean;

public interface IMemberService {
/*
	PageBean<Student> findAllStudents(int pageIndex, int pageSize);

	Student findUpdateStudent(String ID);

	SeverResponse<Student> updateStudent(Student student);

	PageBean<Student> findStudentByCondition(FindStudentByCondition findStudentByCondition);

	SeverResponse<Student> deleteStudent(String iD);

	SeverResponse<Student> deleteAll(String[] selectedIds);

	SeverResponse<Student> addStudent(Student student);

	int findStudentBanji(Integer sequenceNO);

	Student checkUser(String name, String password);*/

	PageBean<Member> findAllMembers(int pageIndex, int pageSize);

	List<Member> findMember();

}
