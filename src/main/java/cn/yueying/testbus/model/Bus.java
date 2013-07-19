/*******************************************************
 * Copyright 2011 - 2013 HuoLi Tek Corp., Ltd.
 * All rights reserved.
 *
 * Description	:
 * History  	:
 * (ID, Date, Author, Description)
 *
 *******************************************************/
package cn.yueying.testbus.model;

/**
 * @author LuoJ@huoLi.com
 * 
 */
public class Bus {
	private int arrived;
	private int busNum;
	private int order;
	private String stopId;

	public int getArrived() {
		return arrived;
	}

	public void setArrived(int arrived) {
		this.arrived = arrived;
	}

	public int getBusNum() {
		return busNum;
	}

	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

}
