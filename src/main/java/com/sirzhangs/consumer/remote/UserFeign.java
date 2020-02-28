package com.sirzhangs.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sirzhangs.common.entity.RequestResult;
import com.sirzhangs.consumer.entity.User;
import com.sirzhangs.consumer.hystrix.UserHystrix;
/**
 * feign方式远程服务调用
 * @author sirzh
 *
 */
@FeignClient(name = "eureka-provider-one",fallback = UserHystrix.class)
public interface UserFeign {
	
	@PostMapping(value = "/user/manage/add")
	RequestResult add(@RequestBody User user);
	
	@GetMapping(value = "/user/manage/findById/{id}")
	RequestResult findById(@PathVariable("id")String id);

}
