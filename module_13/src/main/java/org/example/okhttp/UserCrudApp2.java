package org.example.okhttp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.*;
import org.example.models.UserEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserCrudApp2 {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";

    private static final Gson gson = new Gson();
    private static final OkHttpClient client = new OkHttpClient();

    public static UserEntity createUser() {
        try {
            RequestBody requestBody = RequestBody.create(
                    MediaType.parse("application/json"),
                    "{\"name\":\"Ragnar Lothbrok\",\"username\":\"frenchConquerent\",\"email\":\"rlothbrok@example.com\"}");

            Request request = new Request.Builder()
                    .url(BASE_URL)
                    .post(requestBody)
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                return getUserEntity(response.body().string());
            }
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong", e);
        }
        return null;
    }

    public static UserEntity updateUser(int id) {
        try {
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), "{\"id\":5,\"name\":\"Bjorn Ironside\",\"username\":\"ironside\",\"email\":\"ragnarsson@example.com\"}");

            Request request = new Request.Builder()
                    .url(BASE_URL + "/" + id)
                    .put(requestBody)
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                return getUserEntity(response.body().string());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static boolean deleteUser(int id) {
        try {
            Request request = new Request.Builder()
                    .url(BASE_URL + "/" + id)
                    .delete()
                    .build();

            Response response = client.newCall(request).execute();
            return response.isSuccessful();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static List<UserEntity> getUsers() {
        try {
            Request request = new Request.Builder()
                    .url(BASE_URL)
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                return gson.fromJson(responseBody, new TypeToken<List<UserEntity>>() {
                }.getType());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Optional<UserEntity> getUserById(int id) {
        try {
            Request request = new Request.Builder()
                    .url(BASE_URL + "/" + id)
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                UserEntity user = gson.fromJson(responseBody, UserEntity.class);
                return Optional.ofNullable(user);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static Optional<UserEntity> getUserByUsername(String username) {
        try {
            HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL).newBuilder();
            urlBuilder.addQueryParameter("username", username);

            Request request = new Request.Builder()
                    .url(urlBuilder.build())
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                List<UserEntity> users = gson.fromJson(responseBody, new TypeToken<List<UserEntity>>() {
                }.getType());
                if (!users.isEmpty()) {
                    return Optional.of(users.get(0));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static UserEntity getUserEntity(String responseBody) {
        return gson.fromJson(responseBody, UserEntity.class);
    }
}
