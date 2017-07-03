/**
 * Project Name:book-admin
 * File Name:CoredataBookCaseClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年7月1日下午2:52:07
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.client;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookcoremgmt.dto.bookcase.BookCaseReqBody;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;

/**
 * ClassName:CoredataBookCaseClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月1日 下午2:52:07 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface CoredataBookCaseClient {

	
	@RequestMapping(value = "/auth/bookcases/page/{page}/size/{size}", method = RequestMethod.GET)
	public GeneralPagingResult<List<BookCaseRspBody>> findBookCases(
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcases/{bookcaseId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCaseRspBody> findBookCaseById(
			@PathVariable("bookcaseId") String bookcaseId);

	@RequestMapping(value = "/auth/bookcases", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCase(
			@RequestBody BookCaseReqBody bookCaseReqBody);

	@RequestMapping(value = "/auth/bookcases/{bookcaseId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCase(
			@PathVariable("bookcaseId") String bookcaseId,
			@RequestBody BookCaseReqBody bookCaseReqBody);
	
	@RequestMapping(value = "/auth/bookcases/{bookcaseId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCases(
			@PathVariable("bookcaseId") String bookcaseId);
	
}

