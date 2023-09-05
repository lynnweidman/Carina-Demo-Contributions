package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class PatchRegresMethod extends AbstractApiMethodV2 {

    public PatchRegresMethod() {

        super("api/users/_post/rq_patch_regress.json", "api/users/_post/rs_patch_regres.json", "api/users/regres.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
