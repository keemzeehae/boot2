package com.keem.boot2;

import static org.junit.jupiter.api.Assertions.*;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keem.boot2.notice.NoticeVO;
@SpringBootTest
class DBConnectorTest {

	@Autowired
	private DataSource dataSource;
	
	
	@Test
	void test() throws Exception{
		NoticeVO noticeVO=new NoticeVO();
		
		assertNotNull(dataSource.getConnection());
	}

}
