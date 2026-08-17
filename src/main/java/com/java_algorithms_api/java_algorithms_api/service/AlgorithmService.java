package com.java_algorithms_api.java_algorithms_api.service;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;
import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestString;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseData;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseString;

public interface AlgorithmService {

    ParamResponseData fibonacci(ParamRequestData data);

    ParamResponseString stringReversal(ParamRequestString cadena);
}
