package com.ithinksky.bpm;

import org.flowable.rest.service.api.RestResponseFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 */
@Import({
        RestResponseFactory.class
})
@SpringBootApplication(scanBasePackages = {"com.ithinksky.bpm", "org.flowable.rest"})
public class BpmPlatformRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(BpmPlatformRestApplication.class, args);
    }

}
