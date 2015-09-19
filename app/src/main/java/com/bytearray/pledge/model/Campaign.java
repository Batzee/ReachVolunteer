package com.bytearray.pledge.model;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by rsu on 9/19/2015.
 */
@ParseClassName("Campaign")
public class Campaign  extends ParseObject {


    public String getCampaignName() {
        return getString("campaignName");
    }
    public void setCampaignName(String campaignName) {
        put("campaignName", campaignName);
    }
    public String getCampaignDescription() {
        return getString("campDescription");
    }
    public void setCampaignDescription(String campDescription) {
        put("campDescription", campDescription);
    }

    public List<ParseFile> getProgressImages() {
        return getList("images");
    }
    public void setProgressImages(List<ParseFile> images) {
        put("images", images);
    }

    public static ParseQuery<Campaign> getQuery() {
        return ParseQuery.getQuery(Campaign.class);
    }

}
