package com.mao.textNote.service.repo;

import com.mao.textNote.entity.TextEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<TextEntity, Long> {
    void deleteById(Long id);
}
