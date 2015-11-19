/*
 * Copyright © 2015 Hideyuki Tai and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vtnapp.impl.rev141210;

import org.junit.Test;

public class VtnappModuleFactoryTest {
    @Test
    public void testFactoryConstructor() {
        // ensure no exceptions on construction
        new VtnappModuleFactory();
    }
}