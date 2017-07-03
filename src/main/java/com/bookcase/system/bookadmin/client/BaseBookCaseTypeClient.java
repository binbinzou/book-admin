/**
 * Project Name:book-admin
 * File Name:BookCaseTypeClient.java
 * Package Name:com.bookase.system.bookadmin.client
 * Date:2017年6月20日下午8:46:38
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
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcasetype.BookCaseTypeRspBody;

/**
 * ClassName:BookCaseTypeClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年6月20日 下午8:46:38 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookCaseTypeClient {

	@RequestMapping(value = "/auth/bookcasetypes/page/{page}/size/{size}", method = RequestMethod.POST)
	public GeneralPagingResult<List<BookCaseTypeRspBody>> findBookCaseTypes(@RequestBody BookCaseTypeReqQuery query,
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcasetype/{bookCaseTypeId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCaseTypeRspBody> findBookCaseTypeById(
			@PathVariable("bookCaseTypeId") String bookCaseTypeId);

	@RequestMapping(value = "/auth/bookcasetype", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCaseType(
			@RequestBody BookCaseTypeReqBody bookCaseTypeReqBody);

	@RequestMapping(value = "/auth/bookcasetype/{bookCaseTypeId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCaseType(
			@PathVariable("bookCaseTypeId") String bookCaseTypeId,
			@RequestBody BookCaseTypeReqBody bookCaseTypeReqBody);
	
	@RequestMapping(value = "/auth/bookcasetypes/{bookCaseTypeId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCaseTypes(@PathVariable("bookCaseTypeId") String bookCaseTypeId);
	
	@RequestMapping(value = "/auth/bookcasetype/name/{name}", method = RequestMethod.GET)
	public GeneralContentResult<List<BookCaseTypeRspBody>> findBookCaseTypeByName(@PathVariable("name") String name);
	
}

