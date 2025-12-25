package com.zw.zwojcodesandbox;


import com.zw.zwojcodesandbox.model.ExecuteCodeRequest;
import com.zw.zwojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
