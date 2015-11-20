/*
 * Copyright © 2015 Hideyuki Tai and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.hidetai.odl.example.vtnapp.impl;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.VtnVersionService;

/**
 * {@code VtnMgrService} provides interfaces to control VTN Manager.
 */
public final class VtnMgrService {
    /**
     * Logger instance.
     */
    private static final Logger  LOG = LoggerFactory.getLogger(VtnMgrService.class);

    private ProviderContext  session;

    VtnMgrService(ProviderContext session) {
        this.session = session;
    }

    /**
     * Get the API version of VTN Manager.
     *
     * This method calls the get-manager-version RPC to get the API version of VTN Manager.
     * The RPC is defined in the yang file "vtn-version.yang".
     *
     * @return  The API version.
     */
    Long getApiVersion() {
        VtnVersionService rpc = session.getRpcService(VtnVersionService.class);
        Future<RpcResult<GetManagerVersionOutput>> f = rpc.getManagerVersion();
        try {
            GetManagerVersionOutput output = f.get().getResult();
            return output.getApiVersion();
        } catch (Exception e) {
            LOG.error("get-manager-version RPC failed due to exception.", e);
        }
        return new Long(0);
    }
}
