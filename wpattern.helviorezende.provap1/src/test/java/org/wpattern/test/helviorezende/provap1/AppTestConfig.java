package org.wpattern.test.helviorezende.provap1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.wpattern.helviorezende.provap1.utils.AppConfig;

@Configuration
@Import(value = {AppConfig.class})
@ComponentScan(basePackages = "org.wpattern.test.helviorezende.provap1")
public class AppTestConfig {

}
