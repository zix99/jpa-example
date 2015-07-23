package com.webs.identity.controllers;

import com.webs.identity.dao.PartnerUser;
import com.webs.identity.dao.PartnerUserRepository;
import com.webs.identity.models.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {
    @Autowired
    PartnerUserRepository partnerUserRepository;

    @RequestMapping(value = "/identity", method = RequestMethod.GET)
    public Identity getIdentity(@RequestParam("external_id") String externalId) {


        return new Identity("33");
    }

    @RequestMapping(value = "/identity", method = RequestMethod.POST)
    public Identity addIdentity(@RequestParam("external_id") String externalId, @RequestParam("partner_id") int partnerId) {
        PartnerUser user = this.partnerUserRepository.save(new PartnerUser(externalId, partnerId));
        return new Identity(String.format("%d", user.getId()));
    }
}
