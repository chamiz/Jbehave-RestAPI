package com.example;

import com.example.api.Example;
import com.example.api.Promotion;
import org.junit.Assert;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Jbehave-RestAPI
 * Created by Chamila Ambahera on 10/6/2018.
 * chamila.ambahera@gmail.com
 */

public class GetRequest {

    private static String REST_URI;
    private static Example exampleClass;
    private static Client client = ClientBuilder.newClient();

    /**
     * Set Rest Endpoint
     * @param restURI endpoint
     */

    public static void setRestURI(String restURI){
        REST_URI = restURI;
    }

    /**
     * Send request
     *
     */

    public static void sendRequest() {
        exampleClass = new Example();
        exampleClass =  client
                .target(REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .get(Example.class);
    }

    /**
     * Validate Name
     *
     * @param name name
     */

    public static void validateName(String name){
        System.out.println("Name ::: " +  exampleClass.getName());
        Assert.assertEquals("Name validation failed" , name , exampleClass.getName());
    }

    /**
     * Validate CanReList
     *
     * @param canReList canReList
     */

    public static void validateCanRelist(String canReList){
        System.out.println("CanReList ::: " + exampleClass.getCanRelist());
        Assert.assertEquals("CanReList validation failed" , Boolean.valueOf(canReList) , exampleClass.getCanRelist());
    }

    /**
     * Validate promotion name and description
     *
     * @param name Promotion name
     * @param description Promotion description
     */

    public static void validatePromotions(String name , String description){
        for (Promotion promo : exampleClass.getPromotions()){
            System.out.println( "Promotion Name ::: " +  promo.getName());
            if (promo.getName().equals(name)){
                System.out.println( "Promotion Description ::: " +  promo.getDescription());
                Assert.assertThat("Promotion description validation failed" , promo.getDescription() , containsString(description));
                break;
            }
        }
    }
}
