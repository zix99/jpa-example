package com.webs.identity.controllers;

import com.webs.identity.models.Identity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {
    @RequestMapping(value = "/identity", method = RequestMethod.GET)
    public Identity getIdentity(@RequestParam("external_id") String externalId) {
        return new Identity("33");
    }
}
