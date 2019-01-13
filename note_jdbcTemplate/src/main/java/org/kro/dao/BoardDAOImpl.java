package org.kro.dao;

import java.util.ArrayList;

import org.kro.cmmn.BoardVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class BoardDAOImpl implements BoardDAO {
	
	JdbcTemplate jdbct;

	public BoardDAOImpl(JdbcTemplate jdbct) {
		this.jdbct = jdbct;
	}
	
	public BoardDAOImpl() {

	}

	@Override
	public ArrayList<BoardVO> list() {
		String query = "select * from note_board;";
		return (ArrayList<BoardVO>) jdbct.query(query, new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
	}

	@Override
	public int write(BoardVO boardvo) {
		String query = "insert into note_board(title,writer,content) values(?,?,?)";
		return jdbct.update(query, boardvo.getTitle(), boardvo.getWriter(), boardvo.getContent());
	}

	@Override
	public BoardVO view(String no) {
		String query = "select * from note_board where no = ?";
		return jdbct.queryForObject(query, new Object[]{no}, new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
	}

	@Override
	public void upHit(String no) {
		String query = "update note_board set viewcnt = viewcnt+1 where no = ?";
		jdbct.update(query, no);
		
	}

	@Override
	public int edit(BoardVO boardvo) {
		String query = "update note_board set writer = ?, title = ?, content =? where no = ?";
		return jdbct.update(query, boardvo.getWriter(), boardvo.getTitle(), boardvo.getContent(), boardvo.getNo());
	}

}
