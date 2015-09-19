package com.bytearray.pledge.model;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by rsu on 9/19/2015.
 */
@ParseClassName("Progress")
public class Progress  extends ParseObject {


    public String getProgressTitle() {
        return getString("progressTitle");
    }
    public void setProgressTitle(String progressTitle) {
        put("progressTitle", progressTitle);
    }
    public String getProgressDescription() {
        return getString("progressDescription");
    }
    public void setProgressDescription(String progressDescription) {
        put("progressDescription", progressDescription);
    }

    public ParseObject getCampaing() {
        return getParseObject("campaign");
    }
    public void setCampaign(ParseObject campaign) {
        put("campaign", campaign);
    }

    public List<ParseFile> getProgressImages() {
        return getList("progressImages");
    }
    public void setProgressImages(List<ParseFile> progressImages) {
        put("progressImages", progressImages);
    }

    public static ParseQuery<Progress> getQuery() {
        return ParseQuery.getQuery(Progress.class);
    }
}
