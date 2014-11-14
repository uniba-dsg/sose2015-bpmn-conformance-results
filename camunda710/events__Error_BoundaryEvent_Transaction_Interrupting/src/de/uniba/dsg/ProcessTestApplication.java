package de.uniba.dsg;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Error_BoundaryEvent_Transaction_Interrupting Application")
public class ProcessTestApplication extends ServletProcessApplication{
    //empty implementation
}
