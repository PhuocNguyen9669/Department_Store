package org.phpnteam;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(DepartmentStoreApplication.class);
    }

}