/**
 * Project Name:book-coredatemgmt
 * File Name:BookMsgServiceImpl.java
 * Package Name:com.bookcase.system.bookcoredatamgmt.service.impl
 * Date:2017年5月23日上午8:09:58
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.service.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcase.common.bookcommon.contant.CommonResultCodeConstant;
import com.bookcase.common.system.bookframework.page.PageInfo;
import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookadmin.client.CoredataBookMsgClient;
import com.bookcase.system.bookadmin.service.BookMsgService;
import com.bookcase.system.bookcoremgmt.dto.bookmsg.BookMsgReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookmsg.BookMsgReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;
import com.bookcase.system.bookcoremgmt.otd.bookmsg.BookMsgRspBody;

/**
 * ClassName:BookMsgServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 上午8:09:58 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookMsgServiceImpl implements BookMsgService {

	@Autowired
	CoredataBookMsgClient coredataBookMsgClient;
	
	@Override
	public GeneralPagingResult<List<BookMsgRspBody>> findBookMsgs(String page,
			String size) {
		return coredataBookMsgClient.findBookMsgs(page,size);
	}

	@Override
	public GeneralContentResult<BookMsgRspBody> findBookMsgById(String bookmsgId) {
		return coredataBookMsgClient.findBookMsgById(bookmsgId);
	}

	@Override
	public GeneralContentResult<String> createBookMsg(
			BookMsgReqBody bookMsgReqBody) {
		return coredataBookMsgClient.createBookMsg(bookMsgReqBody);
	}

	@Override
	public GeneralResult updateBookMsg(String bookmsgId,
			BookMsgReqBody bookMsgReqBody) {
		return coredataBookMsgClient.updateBookMsg(bookmsgId,bookMsgReqBody);
	}

	@Override
	public GeneralResult deleteBookMsgs(String bookmsgId) {
		return coredataBookMsgClient.deleteBookMsgs(bookmsgId);
	}


}

