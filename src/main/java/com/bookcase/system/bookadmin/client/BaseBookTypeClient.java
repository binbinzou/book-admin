/**
 * Project Name:book-admin
 * File Name:BaseBooktypeClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年7月1日上午10:34:01
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
import com.bookcase.system.bookbasemgmt.dto.booktype.BookTypeReqBody;
import com.bookcase.system.bookbasemgmt.dto.booktype.BookTypeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.booktype.BookTypeRspBody;

/**
 * ClassName:BaseBooktypeClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月1日 上午10:34:01 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookTypeClient {

	@RequestMapping(value = "/auth/booktypes/page/{page}/size/{size}", method = RequestMethod.POST)
	public GeneralPagingResult<List<BookTypeRspBody>> findBookTypes(@RequestBody BookTypeReqQuery query,
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/booktypes/{bookTypeId}", method = RequestMethod.GET)
	public GeneralContentResult<BookTypeRspBody> findBookTypeById(
			@PathVariable("bookTypeId") String bookTypeId);

	@RequestMapping(value = "/auth/booktypes", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookType(
			@RequestBody BookTypeReqBody bookTypeReqBody);

	@RequestMapping(value = "/auth/booktypes/{bookTypeId}", method = RequestMethod.PUT)
	public GeneralResult updateBookType(
			@PathVariable("bookTypeId") String bookTypeId,
			@RequestBody BookTypeReqBody bookTypeReqBody);
	
	@RequestMapping(value = "/auth/booktypes/{bookTypeId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookTypes(
			@PathVariable("bookTypeId") String bookTypeId);
	
	@RequestMapping(value = "/auth/booktypes/name/{name}", method = RequestMethod.GET)
	public GeneralContentResult<List<BookTypeRspBody>> findBookTypeByName(
			@PathVariable("name") String name);
	
}

