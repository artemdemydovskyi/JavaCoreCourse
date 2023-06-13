package org.example.apache;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TaskApp {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final Gson gson = new Gson();
    private static final HttpClient httpClient = HttpClients.createDefault();

    public static List<TaskEntity> getOpenTasksForUser(int userId) {
        String url = BASE_URL + "/users/" + userId + "/todos?completed=false";

        HttpGet request = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                String responseBody = EntityUtils.toString(response.getEntity());
                TaskEntity[] tasks = gson.fromJson(responseBody, TaskEntity[].class);
                return Arrays.asList(tasks);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
