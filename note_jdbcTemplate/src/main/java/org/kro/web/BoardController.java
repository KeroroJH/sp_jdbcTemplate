package org.kro.web;

import javax.servlet.http.HttpServletRequest;

import org.kro.cmmn.BoardVO;
import org.kro.dao.BoardDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@Autowired
	BoardDAO bDao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping("/list.do")
	public String list(Model model){
		logger.info("list called ...");
		model.addAttribute("boardlist",	bDao.list() );
		return "/list";
	}
	
	@RequestMapping("/view.do")
	public void view(HttpServletRequest req, Model model){
		logger.info("view called .. ");
		String no = req.getParameter("no");
		bDao.upHit(no);
		model.addAttribute("boardview", bDao.view(no));
	}
	
	@RequestMapping("/writeForm.do")
	public void writeForm(){
		logger.info("writeForm called .. ");
	}
	
	@RequestMapping("/write.do")
	public String write(BoardVO boardVO, Model model){
		logger.info("write called .. "+ boardVO.toString());
		bDao.write(boardVO);
		return "redirect:list.do";
	}
	
	@RequestMapping("/editForm.do")
	public String editForm(HttpServletRequest req, Model model){
		String no = req.getParameter("no");
		logger.info("editForm called .. 글번호 : "+no);
		model.addAttribute("boardview", bDao.view(no));
		return "/editForm";
	}

	@RequestMapping("/edit.do")
	public String edit(BoardVO boardVO, Model model){
		logger.info("edit called .. 글번호 : " + boardVO.getNo() );
		bDao.edit(boardVO);
		return "redirect:list.do";
	}
}
