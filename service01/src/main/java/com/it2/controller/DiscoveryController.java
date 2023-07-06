package com.it2.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 添加类注释
 *
 * @author xiehao
 * @version v1.0
 * @date 2023/7/5.
 */
@RestController
public class DiscoveryController {
    @NacosInjected
    private NamingService namingService;

    /**
     * 根据服务名称获取服务的所有（机器）实例信息
     * @param serviceName 服务名称
     * @return
     * @throws NacosException
     */
    @GetMapping("getInstances")
    public List<Instance> getInstances(String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
