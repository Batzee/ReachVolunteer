package com.bytearray.pledge.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by rsu on 9/19/2015.
 */
@ParseClassName("VolCategory")
public class VolCategory  extends ParseObject {

    public String getVolCategoryId() {
        return getObjectId();
    }

    public String getCategory() {
        return getString("category");
    }
    public void setCategory(String categoryName) {
        put("category", categoryName);
    }

    public static ParseQuery<VolCategory> getQuery() {
        return ParseQuery.getQuery(VolCategory.class);
    }

}
