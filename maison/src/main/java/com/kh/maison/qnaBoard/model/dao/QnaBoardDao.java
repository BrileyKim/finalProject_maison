package com.kh.maison.qnaBoard.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.maison.qnaBoard.model.vo.QnaBoardVo;
import com.kh.maison.qnaBoard.model.vo.QnaCommentVo;

public interface QnaBoardDao {
	
	int insertQnaBoard(SqlSession session,QnaBoardVo QB);
	
	List<QnaBoardVo> selectList(SqlSession session,int cPage, int numPerPage);
	List<QnaBoardVo> selectCommentList(SqlSession session,int cPage, int numPerPage,String msg);
	List<QnaBoardVo> selectSearchList(SqlSession session,int cPage, int numPerPage,String keyword,String select);
	
	int selectCount(SqlSession session);
	
	QnaBoardVo selectQna(SqlSession session,int no);
	
	
	//댓글
	
	int commentInsert(SqlSession session,QnaCommentVo comment);
	List<QnaCommentVo> commentList(SqlSession session,int bno); 

	int updateStatus(SqlSession session,int bno);
	
	int countMyQna(SqlSession session, Map param);
}
