package org.apache.karaf.minho.examples.k8s.controller;

import lombok.extern.java.Log;
import org.apache.karaf.minho.boot.service.ServiceRegistry;
import org.apache.karaf.minho.boot.spi.Service;

@Log
public class Controller implements Service {

    @Override
    public String name() {
        return "minho-k8s-controller";
    }

    @Override
    public void onRegister(ServiceRegistry serviceRegistry) {
        log.info("Registering Minho K8S controller");
    }

}
