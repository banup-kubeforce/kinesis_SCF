package com.example.kinesis_scf;

public interface ProducerService {

    public void putDataIntoKinesis(String payload) throws Exception;
    public void stop();

}
