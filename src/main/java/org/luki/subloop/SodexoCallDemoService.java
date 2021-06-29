package org.luki.subloop;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class SodexoCallDemoService implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("SodexoCallDemoService");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        LOGGER.info("Execute SodexoCallDemoService");
        String taskId = (String) delegateExecution.getVariable("taskId");
        LOGGER.info("Execute SodexoCallDemoService taskId"+taskId);

    }
}
