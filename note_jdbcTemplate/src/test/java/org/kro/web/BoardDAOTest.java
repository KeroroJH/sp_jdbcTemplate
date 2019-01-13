package org.kro.web;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kro.cmmn.BoardVO;
import org.kro.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/root-context.xml"})
public class BoardDAOTest {
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private BoardVO boardvo;
	
	@Test
	public void testGetList(){
		List<BoardVO> dtos =  dao.list();
		for(BoardVO dto : dtos){
			System.out.println(dto.toString());
		}
	}
		
	@Test
	public void testInsertBoard() throws Exception {
		boardvo.setTitle("제목테스트");
		boardvo.setContent("내용 입니다 테스트");
		boardvo.setWriter("작성자 테스트 ");
		dao.write(boardvo);
	}
	
//	@Test
//	public void testReadMember() throws Exception {
//		BoardVO vo = dao.readMember("idid");
//		System.out.println(vo.toString());
//	}
//	
//	@Test
//	public void testReadMemberWithPw() throws Exception {
//		BoardVO vo = dao.readWithPw("idid", "pwpw");
//		System.out.println(vo.toString());
//	}

}
