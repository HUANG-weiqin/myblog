package vvkingg.myblog.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vvkingg.myblog.shiro.AccountRealm;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean("accountRealm")
    public AccountRealm userRealm(){
        return new AccountRealm();
    }

    @Bean("securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("accountRealm")AccountRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return  securityManager;
    }

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean fbean = new ShiroFilterFactoryBean();
        fbean.setSecurityManager(securityManager);
        Map<String, String> fmap = new HashMap<>();
        fmap.put("/fuck","authc");
        fbean.setFilterChainDefinitionMap(fmap);
        return fbean;
    }

}
