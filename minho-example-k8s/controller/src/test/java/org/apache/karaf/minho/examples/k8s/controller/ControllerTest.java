package org.apache.karaf.minho.examples.k8s.controller;

import org.apache.karaf.minho.boot.Minho;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    public void bootstrap() throws Exception {
        Minho minho = Minho.builder().build().start();
    }

}
