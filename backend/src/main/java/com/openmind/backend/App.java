package com.openmind.backend;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        port(8080);
        get("/ping", (req, res) -> {
            res.type("application/json");
            Map<String, String> msg = new HashMap<>();
            msg.put("status", "Backend OpenMind activo");
            return new Gson().toJson(msg);
        });
        System.out.println("Servidor iniciado en http://localhost:8080/ping");
    }
}
