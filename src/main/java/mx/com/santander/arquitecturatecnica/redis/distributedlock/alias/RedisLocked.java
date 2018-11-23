package mx.com.santander.arquitecturatecnica.redis.distributedlock.alias;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

import mx.com.santander.arquitecturatecnica.redis.distributedlock.Locked;
import mx.com.santander.arquitecturatecnica.redis.distributedlock.impl.SimpleRedisLock;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Locked(type = SimpleRedisLock.class)
public @interface RedisLocked {

	@AliasFor(annotation = Locked.class)
	String storeId() default "locks";

	@AliasFor(annotation = Locked.class)
	String[] keys() default { "distributedLockFor" };

	@AliasFor(annotation = Locked.class)
	long expiration() default 5000L;

	@AliasFor(annotation = Locked.class)
	Locked.Type lockedType() default Locked.Type.KEEP_TRYING;
}
