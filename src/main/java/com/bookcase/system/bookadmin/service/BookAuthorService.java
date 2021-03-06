/**
 * Project Name:book-basemgmt
 * File Name:BookAuthorService.java
 * Package Name:com.bookcase.system.bookbasemgmt.service
 * Date:2017年5月24日下午8:47:20
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.service;

import java.util.List;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;

/**
 * ClassName:BookAuthorService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午8:47:20 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface BookAuthorService {

	GeneralPagingResult<List<BookAuthorRspBody>> findBookAuthors(BookAuthorReqQuery query,String page,
			String size);

	GeneralContentResult<BookAuthorRspBody> findBookAuthorById(String authodId);

	GeneralContentResult<String> createBookAuthor(
			BookAuthorReqBody bookAuthorReqBody);

	GeneralResult updateBookAuthor(String authodId,
			BookAuthorReqBody bookAuthorReqBody);

	GeneralResult deleteBookAuthors(String anthorId);

	GeneralContentResult<List<BookAuthorRspBody>> findBookAuthorByName(
			String name);

	

	
	
}

