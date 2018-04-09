package com.situ.xuexiao.pojo;

import java.util.List;

public class Machine {

	private Integer id;
	private String name;
	private Integer workShop;
	private String modelNumber;
	private List<Maintenance> maintenances;

	public Machine() {
		super();
	}

	public Machine(Integer id, String name, Integer workShop, String modelNumber, List<Maintenance> maintenances) {
		super();
		this.id = id;
		this.name = name;
		this.workShop = workShop;
		this.modelNumber = modelNumber;
		this.maintenances = maintenances;
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

	public Integer getWorkShop() {
		return workShop;
	}

	public void setWorkShop(Integer workShop) {
		this.workShop = workShop;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public List<Maintenance> getMaintenances() {
		return maintenances;
	}

	public void setMaintenances(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + ", workShop=" + workShop + ", modelNumber=" + modelNumber
				+ ", maintenances=" + maintenances + "]";
	}

}
