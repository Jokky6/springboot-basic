package MainApplication.core.configuration;

import MainApplication.core.hack.AutoPrefixUrlMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.stereotype.Component;

@Component
public class AutoPrefixConfiguration implements WebMvcRegistrations {

    @Override
    public AutoPrefixUrlMapping getRequestMappingHandlerMapping() {
        return new AutoPrefixUrlMapping();
    }
}
