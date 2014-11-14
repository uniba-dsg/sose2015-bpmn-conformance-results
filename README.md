sose2015-bpmn-conformance-results
=================================
This repository contains the results and raw data of a conformance benchmark of the BPMN engines Activiti, camunda BPM, and jBPM using the [conformance benchmarking tool betsy](https://github.com/uniba-dsg/betsy). The benchmark was executed on November 14th 2014.

## Structure

| Folder     | Contents        | 
| ------------- |-------------| 
| activiti     | raw test data for Activiti| 
| camunda710     | raw test data for camunda BPM | 
| jbpm      |  raw test data for jBPM| 
| reports   | aggregated data and result files|

The folders with raw data for each engine contain a subfolder for each test executed. This subfolder bundels the log of the engine written during test execution, the artifacts deployed, JUnit classes used for executing the test, and the outcome of the test.

The reports folder provides an aggregation for all executed tests with an HTML report and a CSV file.
