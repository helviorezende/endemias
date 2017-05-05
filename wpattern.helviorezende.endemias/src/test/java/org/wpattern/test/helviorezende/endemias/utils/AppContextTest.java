package org.wpattern.test.helviorezende.endemias.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.wpattern.helviorezende.endemias.utils.AppContext;

@Configuration
@Import (value = {AppContext.class})
@ComponentScan(basePackages = {"org.wpattern.test.helviorezende.endemias"})
public class AppContextTest {

}
