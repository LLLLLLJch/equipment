package com.situ.xuexiao.pojo;

import java.util.Date;
import java.util.List;

public class Maintenance {

	private Integer id;
	private String content;
	private Date maintenanceDate;
	private String maintenancePeople;
	private Integer state;
	private String parts;
	private List<Machine> machines;

	public Maintenance() {
		super();
	}

	public Maintenance(Integer id, String content, Date maintenanceDate, String maintenancePeople, Integer state,
			String parts, List<Machine> machines) {
		super();
		this.id = id;
		this.content = content;
		this.maintenanceDate = maintenanceDate;
		this.maintenancePeople = maintenancePeople;
		this.state = state;
		this.parts = parts;
		this.machines = machines;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getMaintenancePeople() {
		return maintenancePeople;
	}

	public void setMaintenancePeople(String maintenancePeople) {
		this.maintenancePeople = maintenancePeople;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public List<Machine> getMachines() {
		return machines;
	}

	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}

	@Override
	public String toString() {
		return "Maintenance [id=" + id + ", content=" + content + ", maintenanceDate=" + maintenanceDate
				+ ", maintenancePeople=" + maintenancePeople + ", state=" + state + ", parts=" + parts + ", machines="
				+ machines + "]";
	}

}
