package cn.yueying.testbus;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import cn.yueying.testbus.model.BusResp;
import cn.yueying.testbus.model.Station;
import com.google.gson.Gson;

/**
 * Hello world!
 * 
 */
public class App {

	private static final String nearby = "http://59.173.9.172:7000/wuhan/stop!nearby.action?jingdu=114.411147960352&weidu=30.5297924115313";

	public static void main(String[] args) throws IOException {
		List<String> stationList = new ArrayList<String>();
		List<Station> stationList1 = new ArrayList<Station>();

		for (int i = 0; i < 1000; i++) {
			URL url = new URL("http://59.173.9.172:7000/wuhan/line!map.action?direction=0&lineNo=" + i);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String str;
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
			conn.disconnect();
			BusResp busResp = new Gson().fromJson(sb.toString(), BusResp.class);

			if (busResp == null || busResp.getJsonr() == null || busResp.getJsonr().getData() == null || busResp.getJsonr().getData().getMap() == null) {
				continue;
			}
			for (Station s : busResp.getJsonr().getData().getMap()) {
				String stationName = s.getStopName();
				if (!stationList.contains(stationName)) {
					stationList.add(stationName);
					s.setPy(PingYinUtil.getFirstSpell(stationName));
					stationList1.add(s);
				}
			}
			System.out.println(i + "\t" + stationList.size());
		}
		System.out.println(stationList.size());

		FileOutputStream fos = new FileOutputStream("d:\\stations.json");
		Gson g = new Gson();
		for (Station s : stationList1) {
			fos.write((g.toJson(s) + "\n").getBytes());
		}
		fos.close();
	}
}
