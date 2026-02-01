package dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// DAO layer - handles HTTP request
public class ApiDAO {

    public void callApi(String name) {

        try {
            // API URL
            String apiUrl = "https://api.agify.io/?name=" + name;

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            if (responseCode == 200) {

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(conn.getInputStream()));

                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // simple print JSON
                System.out.println("\nAPI Response:");
                System.out.println(response.toString());

            } else {
                System.out.println("Failed. HTTP Code: " + responseCode);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
