package org.kro.dao;

import java.util.ArrayList;

import org.kro.cmmn.BoardVO;

public interface BoardDAO {
	public ArrayList<BoardVO> list();
	public int write(BoardVO boardvo);
	public BoardVO view(String no);
	public void upHit(String no);
	public int edit(BoardVO boardvo);
}
