package mx.com.santander.arquitecturatecnica.redis.distributedlock.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import mx.com.santander.arquitecturatecnica.redis.distributedlock.Lock;
import mx.com.santander.arquitecturatecnica.redis.distributedlock.impl.SimpleRedisLock;

@Configuration
public class RedisDistributedLockConfiguration {

	@Bean
	public Lock simpleRedisLock(final StringRedisTemplate stringRedisTemplate) {
		return new SimpleRedisLock(stringRedisTemplate);
	}

}
