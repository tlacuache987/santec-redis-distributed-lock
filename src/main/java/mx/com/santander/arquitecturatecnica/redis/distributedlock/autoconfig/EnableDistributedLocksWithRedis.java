package mx.com.santander.arquitecturatecnica.redis.distributedlock.autoconfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ RedisDistributedLockConfiguration.class, RedisAnnotationAspectsDistributedLockConfiguration.class })
public @interface EnableDistributedLocksWithRedis {
}
