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
public class Station {

	private float jingdu;
	private float weidu;
	private int order;
	private String stopId;
	private String stopName;
	private String stopNo;
	private String py;

	public float getJingdu() {
		return jingdu;
	}

	public void setJingdu(float jingdu) {
		this.jingdu = jingdu;
	}

	public float getWeidu() {
		return weidu;
	}

	public void setWeidu(float weidu) {
		this.weidu = weidu;
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

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getStopNo() {
		return stopNo;
	}

	public void setStopNo(String stopNo) {
		this.stopNo = stopNo;
	}

	public String getPy() {
		return py;
	}

	public void setPy(String py) {
		this.py = py;
	}

}
