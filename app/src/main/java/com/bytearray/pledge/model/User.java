package com.bytearray.pledge.model;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by rsu on 9/19/2015.
 */
public class User extends ParseObject {


    public String getName() {
        return getString("name");
    }
    public void setName(String name) {
        put("name", name);
    }

    public String getFbId() {
        return getString("facebookId");
    }
    public void setFbId(String fbId) {
        put("facebookId", fbId);
    }

    public ParseFile getImage() {
        return getParseFile("image");
    }
    public void setImage(ParseFile image[]) {
        put("image", image);
    }
    public boolean isDraft() {
        return  getBoolean("isDraft");
    }
    public void setDraft(boolean isDraft) {
        put("isDraft", isDraft);
    }


    public static ParseQuery<User> getQuery() {
        return ParseQuery.getQuery(User.class);
    }
}
