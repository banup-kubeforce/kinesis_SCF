package com.kubeforce.kinesis_rest;

public interface ProducerService {

    public void putDataIntoKinesis(String payload) throws Exception;
    public void stop();

}
