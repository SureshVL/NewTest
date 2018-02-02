

import java.net.HttpURLConnection;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//HttpURLConnection httpURLConnection=ZapiTest.createHttpCon1("https://transform.aia.org/rest/api/latest/issue/DEV-494", "GET");
			//HttpURLConnection httpURLConnection=ZapiTest.createHttpCon1("https://transform.aia.org/rest/zephyr/latest/cycle", "GET");
			
			//HttpURLConnection httpURLConnection=ZapiTest.createHttpCon1("http://localhost:8080/rest/zapi/latest/systemInfo", "GET");

			
			HttpURLConnection httpURLConnection=ZapiTest.createHttpCon1("http://localhost:8080/rest/zapi/latest/execution?issueId=10005","GET");

			
		System.out.println(httpURLConnection.getContent());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
