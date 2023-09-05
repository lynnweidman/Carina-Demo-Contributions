package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class PostRegresMethod extends AbstractApiMethodV2 {

    public PostRegresMethod() {
        super("api/users/_post/rq_regres.json", "api/users/_post/rs_regres.json", "api/users/regres.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
