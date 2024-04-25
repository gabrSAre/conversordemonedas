package com.challencealura.conversordemonedas.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BibliotecaGson {


       Gson gson = new GsonBuilder()
               .setPrettyPrinting()
               .create();

    public Gson getGson() {

        return gson;
    }
}
