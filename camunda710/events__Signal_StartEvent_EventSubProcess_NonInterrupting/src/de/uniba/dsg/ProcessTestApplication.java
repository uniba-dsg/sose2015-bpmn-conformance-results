package de.uniba.dsg;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Signal_StartEvent_EventSubProcess_NonInterrupting Application")
public class ProcessTestApplication extends ServletProcessApplication{
    //empty implementation
}
