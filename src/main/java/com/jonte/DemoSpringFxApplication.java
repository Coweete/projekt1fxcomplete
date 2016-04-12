package com.jonte;/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */




import controller.Controller;
import gui.MainWindow;
import input.SebbeTest;
import javafx.application.Application;
import javafx.stage.Stage;
import model.PiStamp;
import model.RfidKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class DemoSpringFxApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(DemoSpringFxApplication.class);
	private RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringFxApplication.class, args);
    }

	@Override
	public void run(String... strings) throws Exception {
		//RestTemplate restTemplate = new RestTemplate();
        //RfidKey key = new RfidKey("C48659EC");
         String key = "C48659EC";
		//restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

		Object test = restTemplate.getForObject("http://192.168.1.46:8080/users/" + key, Object.class);
        System.out.println(test.toString());
    }
	public String getFromServer(){
		return restTemplate.getForObject("http://192.168.1.51:8080/pi", String.class);
	}
    public String sendToServer(String rfidKey){
        Map<String, Object> res = restTemplate.getForObject("http://192.168.1.51:8080/pi/" + rfidKey, Map.class);

        //Map<String, Object> res = restTemplate.getForObject("http://192.168.1.51:8080/pi/" + rfidKey , Map.class);
        String text = res.get("firstName").toString();
        return text;
    }
	public static String test(){
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		String res = restTemplate.getForObject("http://192.168.1.46:8080/users", String.class);
		//String res = restTemplate.getForObject("http://192.168.1.51:8080/pi/1", String.class);
		return res;
	}
}
