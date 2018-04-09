package com.situ.xuexiao.pojo;

import java.util.Date;

public class MachineMaintenance {

	private Integer id;
	private String content;
	private Date maintenanceDate;
	private String maintenancePeople;
	private String modelNumber;
	private String parts;
	private Integer state;
	private String machineName;

	public MachineMaintenance() {
		super();
	}

	public MachineMaintenance(Integer id, String content, Date maintenanceDate, String maintenancePeople,
			String modelNumber, String parts, Integer state, String machineName) {
		super();
		this.id = id;
		this.content = content;
		this.maintenanceDate = maintenanceDate;
		this.maintenancePeople = maintenancePeople;
		this.modelNumber = modelNumber;
		this.parts = parts;
		this.state = state;
		this.machineName = machineName;
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

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	@Override
	public String toString() {
		return "MachineMaintenance [id=" + id + ", content=" + content + ", maintenanceDate=" + maintenanceDate
				+ ", maintenancePeople=" + maintenancePeople + ", modelNumber=" + modelNumber + ", parts=" + parts
				+ ", state=" + state + ", machineName=" + machineName + "]";
	}

}
