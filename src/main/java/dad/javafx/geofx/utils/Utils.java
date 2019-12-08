package dad.javafx.geofx.utils;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Utils {
	public final static String IPIFY_KEY = "at_bkFA1Kp06gm82VWwzNUtLyWVEFJYG";
	public final static String IPAPI_KEY = "aee1e49bc0d48a9b97bfc81e1e19b0ed";

	public static String getUserIP() {

		try {

			Ip ip = Unirest.get("https://geo.ipify.org/api/v1?apiKey=" + IPIFY_KEY).asObject(Ip.class).getBody();
			System.out.println(ip.getIp());
			return ip.getIp();

		} catch (UnirestException e) {
			Mensaje.sendConnectionError("Error", "", "Fallo al obtener la IP del usuario");
		}

		return null;
	}

}
