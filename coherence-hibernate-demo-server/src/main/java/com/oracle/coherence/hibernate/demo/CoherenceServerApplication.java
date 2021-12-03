/*
 * Copyright (c) 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.hibernate.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.CacheFactoryBuilder;
import com.tangosol.net.NamedCache;
/*
import com.tangosol.net.Coherence;
import com.tangosol.net.CoherenceConfiguration;
import com.tangosol.net.NamedMap;
import com.tangosol.net.SessionConfiguration;*/

import com.tangosol.net.DefaultCacheServer;
/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
public class CoherenceServerApplication {

	
  //private  NamedCache cache  = CacheFactory.getCache("dist-extend");
 // DefaultCacheServer cachDefServer = new DefaultCacheServer(null);
  //CacheFactoryBuilder
  // CacheFactory.getCacheFactoryBuilder().getConfigurableCacheFactory();
    
	public static void main(String[] args) {
		SpringApplication.run(CoherenceServerApplication.class, args);
		DefaultCacheServer.main(args);
	}

	/*
	 * @Bean(destroyMethod = "close") public Coherence coherenceServer() { final
	 * SessionConfiguration sessionConfiguration = SessionConfiguration.builder()
	 * .withConfigUri("coherence-cache-config.xml") .build();
	 * 
	 * final CoherenceConfiguration cfg = CoherenceConfiguration.builder()
	 * .withSessions(sessionConfiguration) .build(); final Coherence coherence =
	 * Coherence.clusterMember(cfg); coherence.start().join();
	 * 
	 * return coherence; }
	 */
}
