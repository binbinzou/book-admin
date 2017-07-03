/**
 * Project Name:book-admin
 * File Name:CoredataBookMsgClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年7月1日下午5:08:09
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
import com.bookcase.system.bookcoremgmt.dto.bookmsg.BookMsgReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookmsg.BookMsgReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookmsg.BookMsgRspBody;

/**
 * ClassName:CoredataBookMsgClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月1日 下午5:08:09 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface CoredataBookMsgClient {

	@RequestMapping(value = "/auth/bookmsgs/page/{page}/size/{size}", method = RequestMethod.GET)
	public GeneralPagingResult<List<BookMsgRspBody>> findBookMsgs(
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookmsgs/{bookmsgId}", method = RequestMethod.GET)
	public GeneralContentResult<BookMsgRspBody> findBookMsgById(
			@PathVariable("bookmsgId") String bookmsgId);

	@RequestMapping(value = "/auth/bookmsgs", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookMsg(
			@RequestBody BookMsgReqBody bookMsgReqBody);

	@RequestMapping(value = "/auth/bookmsgs/{bookmsgId}", method = RequestMethod.PUT)
	public GeneralResult updateBookMsg(
			@PathVariable("bookmsgId") String bookmsgId,
			@RequestBody BookMsgReqBody bookMsgReqBody);
	
	@RequestMapping(value = "/auth/bookmsgs", method = RequestMethod.DELETE)
	public GeneralResult deleteBookMsgs(
			@RequestBody String bookmsgId);
	
	
}

