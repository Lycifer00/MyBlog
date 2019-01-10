package com.codegym.cms.repository;

import com.codegym.cms.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {

    Page<Blog> findAll(Pageable pageable);
}
