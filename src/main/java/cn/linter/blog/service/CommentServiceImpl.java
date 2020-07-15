package cn.linter.blog.service;

import cn.linter.blog.entity.Comment;
import cn.linter.blog.entity.User;
import cn.linter.blog.mapper.CommentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public int addComment(Comment comment, User user) {
        comment.setUser(user);
        LocalDateTime localDateTime = LocalDateTime.now();
        comment.setCreateTime(localDateTime);
        return commentMapper.insertComment(comment);
    }

    @Override
    public PageInfo<?> getComments(int articleId, int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<Comment> comments = commentMapper.selectComments(articleId);
        return new PageInfo<>(comments);
    }
}
