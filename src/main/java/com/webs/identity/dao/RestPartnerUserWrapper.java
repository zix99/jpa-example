package com.webs.identity.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chris on 7/23/15.
 */
@RepositoryRestResource(path = "/identitywrapper")
public interface RestPartnerUserWrapper extends PagingAndSortingRepository<PartnerUser, Long> {

}
