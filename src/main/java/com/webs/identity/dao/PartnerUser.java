package com.webs.identity.dao;

import javax.persistence.*;

/**
 * Created by chris on 7/22/15.
 */
@Entity
@Table(name = "users")
public class PartnerUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "partner_id")
    private int partnerId;

    public PartnerUser(){}

    public PartnerUser(String externalId, int partnerId) {
        this.externalId = externalId;
        this.partnerId = partnerId;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    @Override
    public String toString() {
        return String.format("User[%s, %d]", this.externalId, this.partnerId);
    }
}
