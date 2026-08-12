package com.java_algorithms_api.java_algorithms_api.service;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseData;

public interface AlgorithmService {

    ParamResponseData fibonacci(ParamRequestData data);
}
