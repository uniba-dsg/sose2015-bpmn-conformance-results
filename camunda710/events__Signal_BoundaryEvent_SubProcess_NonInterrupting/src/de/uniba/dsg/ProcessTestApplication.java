package de.uniba.dsg;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Signal_BoundaryEvent_SubProcess_NonInterrupting Application")
public class ProcessTestApplication extends ServletProcessApplication{
    //empty implementation
}
