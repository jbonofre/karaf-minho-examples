package org.apache.karaf.minho.examples.k8s.controller;

import org.apache.karaf.minho.boot.Minho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ControllerTest {

    @Test
    public void bootstrap() throws Exception {
        Minho minho = Minho.builder().build().start();

        URL url = new URL("http://localhost:8080/api/health");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoInput(true);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Assertions.assertEquals("ready", line);
            }
        }

        minho.close();
    }

}
