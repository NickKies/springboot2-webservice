package com.practice.book.springboot.web.service.posts;

import com.practice.book.springboot.domain.posts.PostsRepository;
import com.practice.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto reqeustDto) {
        return postsRepository.save(reqeustDto.toEntity()).getId();
    }

}
