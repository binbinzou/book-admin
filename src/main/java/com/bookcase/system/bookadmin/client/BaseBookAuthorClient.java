/**
 * Project Name:book-admin
 * File Name:BaseBookAuthorClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年6月26日下午9:00:34
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
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;

/**
 * ClassName:BaseBookAuthorClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年6月26日 下午9:00:34 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookAuthorClient {

	@RequestMapping(value = "/auth/bookauthors/page/{page}/size/{size}", method = RequestMethod.POST)
	public GeneralPagingResult<List<BookAuthorRspBody>> findBookAuthors(@RequestBody BookAuthorReqQuery query,
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookauthors/{anthorId}", method = RequestMethod.GET)
	public GeneralContentResult<BookAuthorRspBody> findBookAuthorById(
			@PathVariable("anthorId") String anthorId);

	@RequestMapping(value = "/auth/bookauthors", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookAuthor(
			@RequestBody BookAuthorReqBody bookAuthorReqBody);

	@RequestMapping(value = "/auth/bookauthors/{anthorId}", method = RequestMethod.PUT)
	public GeneralResult updateBookAuthor(
			@PathVariable("anthorId") String anthorId,
			@RequestBody BookAuthorReqBody bookAuthorReqBody);
	
	@RequestMapping(value = "/auth/bookauthors/{anthorId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookAuthors(
			@PathVariable("anthorId") String anthorId);
	
	@RequestMapping(value = "/auth/bookauthors/name/{name}", method = RequestMethod.GET)
	public GeneralContentResult<List<BookAuthorRspBody>> findBookAuthorByName(
			@PathVariable("name") String name);
	
}

