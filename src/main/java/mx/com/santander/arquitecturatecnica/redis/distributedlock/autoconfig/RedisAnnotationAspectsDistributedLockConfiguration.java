package mx.com.santander.arquitecturatecnica.redis.distributedlock.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.santander.arquitecturatecnica.redis.distributedlock.Lock;
import mx.com.santander.arquitecturatecnica.redis.distributedlock.aspects.LockedAspect;

@Configuration
public class RedisAnnotationAspectsDistributedLockConfiguration {

	@Bean
	public LockedAspect lockedAspect(Lock simpleRedisLock) {
		return new LockedAspect(simpleRedisLock);
	}

}
