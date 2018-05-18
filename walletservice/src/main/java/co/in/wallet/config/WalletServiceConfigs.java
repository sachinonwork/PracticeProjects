package co.in.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import javax.servlet.Filter;

public class WalletServiceConfigs {

    @Bean
    public Filter eTagFilter() {
        return new ShallowEtagHeaderFilter();
    }
}
