package vasilis.user;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class utility {
	/**
	 * Null check method
	 * @param txt
	 * @return
	 */
public static boolean isNotNull(String txt){
	// Syste.out.println("Inside isNotNull");
	return txt != null && txt.trim().length() >= 0 ? true : false;
	
}
/**
 * Method to construct Json
 * 
 * @param tag
 * @param status
 * @return
 */
public static String constructJSON(String tag, boolean status) {
	JSONObject obj = new JSONObject();
	try {
		obj.put("tag", tag);
		obj.put("status", new Boolean(status));
	}catch (JSONException e) {
		// TODO Auto-generate catch block
	}
	return obj.toString();
	
	
}

/**
 *  Method to construct JSON with Error Msg
 * @param tag
 * @param status
 * @param err_msg
 * @return
 */
public static String constructJSON(String tag, boolean status, String err_msg) {
	JSONObject obj = new JSONObject();
	try{
		obj.put("tag", tag);
		obj.put("status", new Boolean(status));
		obj.put("err_msg", err_msg);
	} catch (JSONException e ) {
		// TODO Auto-generate catch block
	}
	return obj.toString();
  }

}
