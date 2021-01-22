package com.meek.freshapp.domain;

import javax.persistence.Entity;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

@Entity
@Embeddable
public class Votes {


private VoteId pk;
private Boolean upvotes ;


    public Boolean getUpvotes() {
        return this.upvotes;
    }

    public void setUpvotes(Boolean upvotes) {
        this.upvotes = upvotes;
    }

    @EmbeddedId
    public VoteId getPk() {
        return this.pk;
    }

  
    public void setPk(VoteId pk) {
        this.pk = pk;
    }

    
}
