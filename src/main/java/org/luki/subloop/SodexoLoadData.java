package org.luki.subloop;

import com.sun.tools.javac.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.logging.Logger;

@Component
public class SodexoLoadData implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("SodexoLoadData");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        LOGGER.info("Execute SodexoLoadData");
        List<String> taskList = List.of("A", "B", "C", "D");
        ArrayList<String> aStringList = new ArrayList<String>(taskList);
        delegateExecution.setVariable("taskList",aStringList);
    }
}
