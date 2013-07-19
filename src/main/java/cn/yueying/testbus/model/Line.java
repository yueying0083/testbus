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
public class Line {

	private String endStopName;
	private int direction;
	private String firstTime;
	private String lastTime;
	private String lineName;
	private String lineNo;
	private String startStopName;
	private String stopsNum;

	public String getEndStopName() {
		return endStopName;
	}

	public void setEndStopName(String endStopName) {
		this.endStopName = endStopName;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public String getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getStartStopName() {
		return startStopName;
	}

	public void setStartStopName(String startStopName) {
		this.startStopName = startStopName;
	}

	public String getStopsNum() {
		return stopsNum;
	}

	public void setStopsNum(String stopsNum) {
		this.stopsNum = stopsNum;
	}

}
