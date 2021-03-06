/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.extensiblecatalog.ncip.v2.service;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.util.GregorianCalendar;

public class UserPrivilegeStatus {

    /**
     * User Privilege Status Type
     */
    protected UserPrivilegeStatusType userPrivilegeStatusType;
    /**
     * Date Of User Privilege Status
     */
    protected GregorianCalendar dateOfUserPrivilegeStatus;

    public UserPrivilegeStatusType getUserPrivilegeStatusType() {
        return userPrivilegeStatusType;
    }

    public void setUserPrivilegeStatusType(UserPrivilegeStatusType userPrivilegeStatusType) {
        this.userPrivilegeStatusType = userPrivilegeStatusType;
    }

    public GregorianCalendar getDateOfUserPrivilegeStatus() {
        return dateOfUserPrivilegeStatus;
    }

    public void setDateOfUserPrivilegeStatus(GregorianCalendar dateOfUserPrivilegeStatus) {
        this.dateOfUserPrivilegeStatus = dateOfUserPrivilegeStatus;
    }

    /**
     * Generic toString() implementation.
     *
     * @return String
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }

}
