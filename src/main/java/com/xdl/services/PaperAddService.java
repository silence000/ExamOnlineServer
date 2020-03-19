package com.xdl.services;

import com.xdl.bean.Paper;
import com.xdl.bean.PaperCreateParam;
import com.xdl.bean.Question;
import com.xdl.mapper.PaperMapper;
import com.xdl.mapper.QuestionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaperAddService {
    @Resource
    private PaperMapper paperMapper;
    @Resource
    private QuestionMapper questionMapper;

    @Transactional
    public int addPaper(PaperCreateParam paperCreateParam) {
        Paper paper = new Paper();
        paper.setName(paperCreateParam.getPaperName());
        paper.setDuration(paperCreateParam.getTime());
        paper.setTotal_point(paperCreateParam.getPaperPoint());
        paper.setPass_point(paperCreateParam.getPassPoint());
        paper.setStatus(1);
        paper.setSummary("没有总结");
        paper.setAnswer_sheet("没有答题卡");
        paper.setCreator("Admin");
        paper.setDifficulty(paperCreateParam.getDifficulty());
        int status1 = paperMapper.insertPaper(paper);
        List<Question> choiceQuestion = questionMapper.getRandomQuestionByQuestion_typeAndNumber(1, paperCreateParam.getQuestionTypeNum().get(1));
        int status2 = 0;
        int order_num = 0;
        for (int i = 0; i < choiceQuestion.size(); i++) {
            status2 = paperMapper.insertPaper_2_question(paper.getId(), choiceQuestion.get(i).getId(), order_num);
            if (status2 == 0)
                break;
            order_num++;
        }
        List<Question> subjectiveQuestion = questionMapper.getRandomQuestionByQuestion_typeAndNumber(2, paperCreateParam.getQuestionTypeNum().get(2));
        int status3 = 0;
        for (int i = 0; i < subjectiveQuestion.size(); i++) {
            status3 = paperMapper.insertPaper_2_question(paper.getId(), subjectiveQuestion.get(i).getId(),order_num);
            if (status3 == 0)
                break;
            order_num++;
        }
        if (status1 == 1) {
            if (status2 == 1) {
                if (status3 == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
}
