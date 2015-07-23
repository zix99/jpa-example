package com.webs.identity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chris on 7/22/15.
 */
public interface PartnerUserRepository extends CrudRepository<PartnerUser, Long> {
    PartnerUser getUserById(String external_id, int partner_id);
}
