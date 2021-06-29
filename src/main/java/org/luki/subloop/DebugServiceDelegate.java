package org.luki.subloop;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DebugServiceDelegate  implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("DebugServiceDelegate");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Run");
    }
}
