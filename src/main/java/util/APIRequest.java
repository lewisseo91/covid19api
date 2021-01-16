package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIRequest {

    public static String getApiRequest(String inputUrl) throws IOException {
        URL url = new URL(inputUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = httpURLConnection.getResponseCode();
        if( responseCode == HttpURLConnection.HTTP_OK ) {
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String readLine;

            while((readLine = responseReader.readLine()) != null) {
                stringBuffer.append(readLine + "\n");
            }
            responseReader.close();
            return stringBuffer.toString();
        }

        return Integer.toString(responseCode);
    }

}
