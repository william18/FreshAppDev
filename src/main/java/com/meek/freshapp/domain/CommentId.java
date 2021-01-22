package com.meek.freshapp.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable; 

@Embeddable
public class CommentId implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6194605176374087357L;
    private User user;
    private Feature feature;

    @ManyToOne
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Feature getFeature() {
        return this.feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }


}
