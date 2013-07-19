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

import java.util.List;

/**
 * @author LuoJ@huoLi.com
 * 
 */
public class BusResp {

	private Jsonr jsonr;

	public Jsonr getJsonr() {
		return jsonr;
	}

	public void setJsonr(Jsonr jsonr) {
		this.jsonr = jsonr;
	}

	public static class Jsonr {
		private Data data;

		public Data getData() {
			return data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {
			private List<Bus> bus;
			private List<Station> map;
			private boolean opposite;
			private Line line;

			public List<Bus> getBus() {
				return bus;
			}

			public void setBus(List<Bus> bus) {
				this.bus = bus;
			}

			public List<Station> getMap() {
				return map;
			}

			public void setMap(List<Station> map) {
				this.map = map;
			}

			public boolean isOpposite() {
				return opposite;
			}

			public void setOpposite(boolean opposite) {
				this.opposite = opposite;
			}

			public Line getLine() {
				return line;
			}

			public void setLine(Line line) {
				this.line = line;
			}

		}
	}

}
