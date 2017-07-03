/**
 * Project Name:book-admin
 * File Name:CoredataBookDispatchClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年7月1日下午5:00:02
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.client;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookcoremgmt.dto.bookdispatch.BookDispatchReqBody;
import com.bookcase.system.bookcoremgmt.otd.bookdispatch.BookDispatchRspBody;

/**
 * ClassName:CoredataBookDispatchClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月1日 下午5:00:02 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient("book-coredata")
public interface CoredataBookDispatchClient {

	@RequestMapping(value = "/auth/bookdispatchs/page/{page}/size/{size}", method = RequestMethod.GET)
	public GeneralPagingResult<List<BookDispatchRspBody>> findBookDispatchs(
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookdispatchs/{bookDispatchId}", method = RequestMethod.GET)
	public GeneralContentResult<BookDispatchRspBody> findBookDispatchById(
			@PathVariable("bookDispatchId") String bookDispatchId);

	@RequestMapping(value = "/auth/bookdispatchs", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookDispatch(
			@RequestBody BookDispatchReqBody BookDispatchReqBody);
	
	@RequestMapping(value = "/auth/BookDispatchs/{bookDispatchId}", method = RequestMethod.PUT)
	public GeneralResult updateBookDispatch(
			@PathVariable("bookDispatchId") String bookDispatchId,
			@RequestBody BookDispatchReqBody BookDispatchReqBody);
	
	@RequestMapping(value = "/auth/BookDispatchs/{bookDispatchId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookDispatchs(
			@PathVariable("bookDispatchId") String bookDispatchId);
	
}

