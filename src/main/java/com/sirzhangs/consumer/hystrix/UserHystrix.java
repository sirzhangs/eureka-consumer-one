package com.sirzhangs.consumer.hystrix;

import org.springframework.stereotype.Component;

import com.sirzhangs.common.entity.RequestResult;
import com.sirzhangs.consumer.entity.User;
import com.sirzhangs.consumer.remote.UserFeign;
/**
 * 采用Feign及其自带的Hystrix熔断
 * @author sirzh
 *
 */
@Component
public class UserHystrix implements UserFeign{

	@Override
	public RequestResult add(User user) {
		return RequestResult.fail("add,Feign方式");
	}

	@Override
	public RequestResult findById(String id) {
		return RequestResult.fail("findById,Feign方式");
	}

}
