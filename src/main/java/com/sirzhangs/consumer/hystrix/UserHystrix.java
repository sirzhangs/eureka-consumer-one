package com.sirzhangs.consumer.hystrix;

import org.springframework.stereotype.Component;

import com.sirzhangs.common.entity.RequestResult;
import com.sirzhangs.consumer.entity.User;
import com.sirzhangs.consumer.remote.UserFeign;

@Component
public class UserHystrix implements UserFeign{

	@Override
	public RequestResult add(User user) {
		return RequestResult.fail();
	}

	@Override
	public RequestResult findById(String id) {
		return RequestResult.fail();
	}

}
