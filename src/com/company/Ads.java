package com.company;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Ads {
    private String ddcid=;
    private String dealerName;
    private String city;
    private String zip;
    private String campaign;
    private String adgroup;
    private String oem="Null";
    private String model ="Null";
    private String classification;
    private String headline1;
    private String headline2;
    private String description;
    private double clicks=-1;
    private double impressions=-1;
    private double cost=-1;

    public Ads(String ddcid, String dealerName, String city, String zip, String campaign, String adgroup, String oem, String model, String aClass, String headline1, String headline2, String description, double clicks, double impressions, double cost) {
        this.ddcid = ddcid;
        this.dealerName = dealerName;
        this.city = city;
        this.zip = zip;
        this.campaign = campaign;
        this.adgroup = adgroup;
        this.oem = oem;
        this.model = model;
        classification = aClass;
        this.headline1 = headline1;
        this.headline2 = headline2;
        this.description = description;
        this.clicks = clicks;
        this.impressions = impressions;
        this.cost = cost;
    }

    public String getDdcid() {
        return ddcid;
    }

    public String getDealerName() {
        return dealerName;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getAdgroup() {
        return adgroup;
    }

    public String getOem() {
        return oem;
    }

    public String getModel() {
        return model;
    }

    public String getClassification() {
        return classification;
    }

    public String getHeadline1() {
        return headline1;
    }

    public String getHeadline2() {
        return headline2;
    }

    public String getDescription() {
        return description;
    }

    public double getClicks() {
        return clicks;
    }

    public double getImpressions() {
        return impressions;
    }

    public double getCost() {
        return cost;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void classify(ArrayList<OEMs> Oems){
        for(int i=0; i<Oems.size();i++){
            if(Oems.get(i).getOem()=="Mazda"){
                Pattern pattern=Pattern.compile("/Mazda\\D(?=[^C])")

            }

        }

    }

}
