package com.ithinksky.bpm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createFlowableRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("flowable-rest API")
                .apiInfo(flowableApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.flowable"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo flowableApiInfo() {
        return new ApiInfoBuilder()
                .title("flowable-rest API 接口文档")
                .version("6.4.1").build();
    }

}
