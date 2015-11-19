/*
 * Copyright © 2015 Hideyuki Tai and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vtnapp.impl.rev141210;

import com.hidetai.odl.example.vtnapp.impl.VtnappProvider;

public class VtnappModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vtnapp.impl.rev141210.AbstractVtnappModule {
    public VtnappModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public VtnappModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vtnapp.impl.rev141210.VtnappModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        VtnappProvider provider = new VtnappProvider();
        getBrokerDependency().registerProvider(provider);
        return provider;
    }

}
