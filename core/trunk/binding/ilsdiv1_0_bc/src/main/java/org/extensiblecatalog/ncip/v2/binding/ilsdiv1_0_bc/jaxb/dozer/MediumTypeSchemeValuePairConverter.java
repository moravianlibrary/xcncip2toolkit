/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_0_bc.jaxb.dozer;

import org.extensiblecatalog.ncip.v2.binding.jaxb.dozer.BaseSchemeValuePairConverter;
import org.extensiblecatalog.ncip.v2.binding.ilsdiv1_0_bc.jaxb.elements.SchemeValuePair;
import org.extensiblecatalog.ncip.v2.service.MediumType;

public class MediumTypeSchemeValuePairConverter
    extends BaseSchemeValuePairConverter<SchemeValuePair,
            MediumType> {

    public MediumTypeSchemeValuePairConverter() {
        super(SchemeValuePair.class,
            MediumType.class);
    }

}
