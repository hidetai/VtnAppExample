/*
 * Copyright © 2015 Hideyuki Tai and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.hidetai.odl.example.vtnapp.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VtnappProvider implements BindingAwareProvider, AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(VtnappProvider.class);

    private VtnMgrService vtnMgr;

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("VtnappProvider Session Initiated");

        vtnMgr = new VtnMgrService(session);
        LOG.info("The API version of VTN Manager is {}", vtnMgr.getApiVersion());
    }

    @Override
    public void close() throws Exception {
        LOG.info("VtnappProvider Closed");
    }

}
