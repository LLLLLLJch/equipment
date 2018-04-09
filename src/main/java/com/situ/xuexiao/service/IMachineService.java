package com.situ.xuexiao.service;

import java.util.List;

import com.situ.xuexiao.pojo.Machine;
import com.situ.xuexiao.vo.PageBean;

public interface IMachineService {
	
	PageBean<Machine> findAllMachines(int pageIndex, int pageSize);

	List<Machine> findMachine(String workShopID);

	List<Machine> findModeNumber(int parseInt);

}
