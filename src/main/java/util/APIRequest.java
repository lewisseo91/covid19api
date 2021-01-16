package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIRequest {

    private static HttpURLConnection httpURLConnection;//;

    public static String getApiRequest(String inputUrl) throws IOException {
        URL url = new URL(inputUrl);
        httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = httpURLConnection.getResponseCode();

        if( responseCode == HttpURLConnection.HTTP_OK ) {
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String readLine;
            while((readLine = responseReader.readLine()) != null) {
                stringBuffer.append(readLine);
                stringBuffer.append("\n");
            }
            responseReader.close();
            System.out.println(stringBuffer);
            return stringBuffer.toString();
        }

        return Integer.toString(responseCode);
    }

}
