package com.webs.integration;

import com.google.common.collect.Lists;
import com.webs.IntegrationTest;
import com.webs.identity.Application;
import com.webs.identity.dao.PartnerUser;
import com.webs.identity.dao.PartnerUserRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 7/23/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Category(IntegrationTest.class)
//@WebIntegrationTest
public class PartnerUserRepositoryIntegrationTests {

    @Autowired
    public PartnerUserRepository partnerUserRepository;

    @Test
    public void SaveNewPartnerUser() {
        partnerUserRepository.save(new PartnerUser("abc", 1231));
    }

    @Test
    public void GetAllPartnerUsers() {
        ArrayList<PartnerUser> partners = Lists.newArrayList(partnerUserRepository.findAll());
        assert partners.size() > 0;
    }
}
