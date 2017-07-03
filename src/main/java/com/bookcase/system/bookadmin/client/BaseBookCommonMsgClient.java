/**
 * Project Name:book-admin
 * File Name:BaseBookCommonMsgClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年6月26日下午9:16:25
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
import com.bookcase.system.bookbasemgmt.dto.bookcommonmsg.BookCommonMsgReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcommonmsg.BookCommonMsgReqParam;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcommonmsg.BookCommonMsgRspBody;

/**
 * ClassName:BaseBookCommonMsgClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年6月26日 下午9:16:25 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookCommonMsgClient {

	@RequestMapping(value = "/auth/bookcommonmsgs/page/{page}/size/{size}", method = RequestMethod.POST)
	public GeneralPagingResult<List<BookCommonMsgRspBody>> findBookCommonMsgs(@RequestBody BookAuthorRspQuery query,
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcommonmsgs/{bookCommonMsgId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCommonMsgRspBody> findBookCommonMsgById(
			@PathVariable("bookCommonMsgId") String bookCommonMsgId);

	@RequestMapping(value = "/auth/bookcommonmsgs", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCommonMsg(
			@RequestBody BookCommonMsgReqBody bookCommonMsgReqBody);

	@RequestMapping(value = "/auth/bookcommonmsgs/{bookCommonMsgId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCommonMsg(
			@PathVariable("bookCommonMsgId") String bookCommonMsgId,
			@RequestBody BookCommonMsgReqBody bookCommonMsgReqBody);
	
	@RequestMapping(value = "/auth/bookcommonmsgs/{bookCommonMsgId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCommonMsgs(
			@PathVariable("bookCommonMsgId") String bookCommonMsgId);
	
	@RequestMapping(value = "/auth/bookcommonmsgs/name/{name}", method = RequestMethod.GET)
	public GeneralContentResult<List<BookCommonMsgRspBody>> findBookCommonMsgByName(
			@PathVariable("name") String name) ;
	
}

