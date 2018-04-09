package com.situ.xuexiao.pojo;

public class Member {

	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String workType;

	public Member() {
		super();
	}

	public Member(Integer id, String name, Integer age, String gender, String workType) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.workType = workType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Override
	public String toString() {
		return "member [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", workType=" + workType
				+ "]";
	}

}
