package com.practice.singleton;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class UserDetails implements Serializable, Cloneable {
    private String name;
    private String address;

    private static UserDetails userDetails;

    private UserDetails() {
        if(userDetails != null) {
            throw new UnsupportedOperationException("UserDetails object cannopt be create");
        }
    }

    public static UserDetails getInstance() {
        if(userDetails == null) {
            userDetails = new UserDetails();
        }
        return userDetails;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("UserDetails clone not supported");
    }

    protected Object readResolve() {
        return getInstance();
    }
}
