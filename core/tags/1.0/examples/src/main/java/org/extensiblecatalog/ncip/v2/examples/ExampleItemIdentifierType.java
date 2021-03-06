/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.extensiblecatalog.ncip.v2.examples;

import org.extensiblecatalog.ncip.v2.service.ItemIdentifierType;

public class ExampleItemIdentifierType extends ItemIdentifierType {
    public static final String EXAMPLE_ITEM_IDENTIFIER_TYPE
        = "http://www.extensiblecatalog.ncip.v2.org/schemes/itemidentifiertype/exampleitemidentifiertype.scm";

    public static final ExampleItemIdentifierType ITEM_ID
        = new ExampleItemIdentifierType(EXAMPLE_ITEM_IDENTIFIER_TYPE, "Item Id");

    public static void loadAll() {
        // Do nothing - merely invoking this method forces the creation of the instances defined above.
    }

    protected ExampleItemIdentifierType(String scheme, String value) {
        super(scheme, value);
        System.out.println("Constructed our example item identifier type.");
    }
}
