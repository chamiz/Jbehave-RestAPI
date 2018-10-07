package com.example.steps;

import com.example.GetRequest;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Jbehave-RestAPI
 * Created by Chamila Ambahera on 10/6/2018.
 * chamila.ambahera@gmail.com
 */

public class WebServiceDemoSteps {
    @Given("URL : $url")
    public void setEndPoint(String url){
        GetRequest.setRestURI(url);
    }

    @When("Send Request")
    public void setRequest(){
        GetRequest.sendRequest();
    }

    @Then("Validate Name : $name")
    public void validateName(String name){
        GetRequest.validateName(name);
    }

    @Then("Validate CanReList : $canReList")
    public void validateCanReList(String canReList){
        GetRequest.validateCanReList(canReList);
    }

    @Then("validate Promotion Name : $name and Description : $description")
    public void validatePromotion(String name , String description){
        GetRequest.validatePromotions(name, description);
    }
}
